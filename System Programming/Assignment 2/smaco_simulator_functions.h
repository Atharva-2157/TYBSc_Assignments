int memory[1000];
int start_address;
int program_counter;
int registers[4];
int condition_code[6];
int last_address;
int program_load_status = 0;

void printOptions()
{
    printf("\n1 : Load");
    printf("\n2 : Print");
    printf("\n3 : Run");
    printf("\n4 : Accept");
    printf("\n5 : Trace");
    printf("\n6 : Exit");
}

void loadProgramIntoMemory(const char *filename)
{
    FILE *fp;
    int address, content;

    fp = fopen(filename,"r");

    if(fp == NULL)
    {
        printf("File opening error");
        exit(0);
    }
    
    while(!feof(fp))
    {
        fscanf(fp, "%d%d", &address, &content);

        if(address == -1)
        {
            program_counter = content;
            start_address = content;
        }
        else
        {
            last_address = address;
            memory[address] = content;
        }
    }
    program_load_status = 1;
    printf("Program sucessfully loaded in memory");
    fclose(fp);
}

void printProgram()
{
    printf("\n");
    if(program_load_status == 0)
    {
        printf("Program is not loaded");
    }
    else
    {
        int i;
        for (i = start_address; i <= last_address; i++)
        {
            printf("%d %d \n", i, memory[i]);
        }
    }
    printf("\n");    
}


void runProgram()
{
    printf("\n");
    if (program_load_status == 0)    
    {
        printf("Program not loaded in memory");
    }
    else
    {
        int opcode, reg_oprand, mem_oprand;
        while(program_counter <= last_address)
        {
            opcode = memory[program_counter] / 10000;
            reg_oprand = (memory[program_counter] / 1000) % 10;
            mem_oprand = memory[program_counter] % 1000;

            switch (opcode)
            {
                case 1:
                {
                    registers[reg_oprand] += memory[mem_oprand];
                }break;

                case 2:
                {
                    registers[reg_oprand] -= memory[mem_oprand];
                }break;

                case 3:
                {
                    registers[reg_oprand] *= memory[mem_oprand];
                }break;

                case 4:
                {
                    registers[reg_oprand] = memory[mem_oprand];
                }break;

                case 5:
                {
                    memory[mem_oprand] = registers[reg_oprand];
                }break;

                case 6:
                {
                    int i;
                    for ( i = 1; i < 6; i++)
                    {
                        condition_code[i] = 0;
                    }
                    
                    if (registers[reg_oprand] < memory[mem_oprand])
                    {
                        condition_code[1] = condition_code[2] = condition_code[6] = 1;
                    }
                    else if (registers[reg_oprand] > memory[mem_oprand])
                    {
                        condition_code[4] = condition_code[5] = condition_code[6] = 1;
                    }
                    else
                    {
                        condition_code[2] = condition_code[3] = condition_code[5] = condition_code[6] = 1;
                    }    
                }break;

                case 7:
                {
                    if ((condition_code[reg_oprand] == 1) || (reg_oprand == 5))
                    {
                        program_counter = mem_oprand;
                    }
                    
                }break;

                case 8:
                {
                    registers[reg_oprand] /= memory[mem_oprand];
                }break;

                case 9:
                {
                    printf("\nGive input :");
                    scanf("%d",&memory[mem_oprand]);
                }break;

                case 10:
                {
                    printf("\nResult is : %d",memory[mem_oprand]);
                }break;

                case 11:
                {
                    return;
                }break;
            }

            program_counter += 1;
        }
        program_counter = start_address;
    }    
}

void acceptProgram()
{
    int address = 0, content = 0;
    char status;
    char name[20];
    FILE *fp;

    printf("Do you want to save this program in a file [y/n] :");
    scanf("%*c%c",&status);
    if (status == 'y')
    {
        printf("Enter filename :");
        scanf("%s",name);
        fp = fopen(name, "w");
    }

    printf("Enter your program here :\n\n");

    do
    {
        scanf("%d%d",&address,&content);
        memory[address] = content;
        if(status == 'y')
        {
            fprintf(fp, "%d %d", address, content);
        }
        if(address == -1)
        {
            program_counter = content;
        }
    }while (address != -1);
}