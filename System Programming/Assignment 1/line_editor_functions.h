typedef struct editbuff
{
    char *line; // character string
    struct editbuff *next; // pointer to next line
}List;

List* readBuffer(const char *filename)
{
    FILE *fp;
    char str[80];
    List *head, *last, *temp;
    head = (List*)malloc(sizeof(List));

    if( (fp=fopen(filename, "r+")) != NULL)
    { 
        head->next = NULL;
        fgets(str,80,fp);
        head->line=(char*)malloc(strlen(str));
        strcpy(head->line,str);
        last = head;
        while(!feof(fp))
        {
            // strcpy(" ", str);
            fgets(str,80,fp);
            // printf("%s",str);
            temp = (List*)malloc(sizeof(List));
            temp->next = NULL;
            temp->line=(char*)malloc(strlen(str));
            strcpy(temp->line,str);
            last->next=temp;
            last=temp; 
        }
    }
    else
    {
        printf("File opening Error");
        exit(1);
    }
    close(fp);
    return head;
}

int lines(List *head)
{
    List *temp = head;
    int cnt;

    while(temp != NULL)
    {
        printf("%s",temp->line);
        temp = temp->next;
        cnt++;
    }
    return cnt;

}

int linesCount(List *head)
{
    List *temp = head;
    int cnt = 0;

    while(temp != NULL)
    {
        temp = temp->next;
        cnt++;
    }
    return cnt;

}

void display(List *head, int num1, int num2)
{
    List *temp = head;
    int i;
    int count = 1;
    for(i = 1; i < num1; i++)
    {
        temp = temp->next;
        count += 1;
    }

    for (i = num1; i <= num2; i++)
    {
        printf("%d : %s",count, temp->line);
        temp = temp->next;
        count += 1;
    }
    
}

List* moveSingleLine(List *head, int num1, int num2)
{
    List *temp1 = head, *temp2 = head, *prev;
    int i;
    prev = temp1;
    for(i = 1; i < num1; i++)
    {
        prev = temp1;
        temp1 = temp1->next;
    }

    for(i = 1; i < num2; i++)
    {
        temp2 = temp2->next;
    }

    if(num1 == 1)
    {
        head = head->next;
    }

    prev->next = temp1->next;
    temp1->next = temp2->next;
    temp2->next = temp1;

    return head; 
}

List* moveMultipleLines(List *head, int num1,int num2,int num3)
{
    List *first = head;
    List *last = head;
    List *location = head;
    List *prev;
    int i;
    for(i = 1; i < num1; i++)
    {
        prev = first;
        first = first->next;
    }

    for ( i = 1; i < num2; i++)
    {
        last = last->next;
    }

    for (i = 1; i < num3; i++)
    {
        location = location->next;
    }

    prev->next = last->next;
    last->next = location->next;
    location->next = first;
    
    return head;
    
}

List* insert(List *head, int num)
{
    List *temp = head, *prev, *nn;
    int i=0;
    char str[80];

    printf("Enter a string :");
    fgets(str,80,stdin);

    nn = (List*)malloc(sizeof(List));
    nn->next = NULL;
    nn->line = (char*)malloc(strlen(str));
    strcpy(nn->line, str);

    if(num == 1) 
    {
        nn->next = head;
        head = nn;
        return head;
    }

    for(i = 1; i < num; i++)
    {
        prev = temp;
        temp = temp->next;
    }
    nn->next = temp;
    prev->next = nn;


    return head;
}

void save(List *head)
{
    FILE *fp;
    char filename[20];
    List *temp = head;
    printf("Enter filename :");
    fgets(filename, 20, stdin);

    fp = fopen(filename, "r");

    if(fp == NULL)
    {
        fp = fopen(filename, "w");

        printf("New file created");

        while (temp != NULL)
        {
            fprintf(fp,"%s",temp->line);
            temp = temp->next;
        }
        
    }
    else
    {
        printf("File found");
    }
    
    
}

List* deleteSingleLine(List *head, int num1)
{
    List *temp = head, *prev;
    int i;

    if(num1 == 1)
    {
        head = head->next;
        free(temp);
        return head;
    }

    for(i = 1; i < num1; i++)
    {
        prev = temp;
        temp = temp->next;
    }

    prev->next = temp->next;
    temp->next = NULL;
    free(temp);

    return head;
}


List* deleteMultipleLine(List *head, int num1, int num2)
{
    List *temp = head, *prev;
    int i;

    prev = head;

    for(i = 1; i < num2; i++)
    {
        temp = temp->next;
    }

    if(num1 == 1)
    {
        head = temp->next;
        temp->next = NULL;
        return head;
    }

    for(i = 1; i < num1 - 1; i++)
    {
        prev = prev->next;
    }

    prev->next = temp->next;
    temp->next = NULL;

    return head;
}

List* appendLine(List *head)
{
    List *temp = head, *nn;
    char str[80];

    printf("Enter a Line :");
    fgets(str, 80, stdin);
    
    nn = (List*)malloc(sizeof(List));
    nn->next = NULL;
    nn->line = (char*)malloc(strlen(str));
    strcpy(nn->line, str);

    while(temp->next != NULL)
    {
        temp = temp->next;
    }

    temp->next = nn;

    return head;


}

List* copy(List *head, int num1, int num2, int num3)
{
    List *temp = head, *dummy_head, *new_node, *prev, *temp2 = head;
    int i;
    for(i = 1; i < num1; i++)
    {
        temp = temp->next;
    }

    dummy_head = (List*)malloc(sizeof(List));
    dummy_head->next = NULL;
    dummy_head->line = (char*)malloc(strlen(temp->line));
    strcpy(dummy_head->line, temp->line);

    prev = dummy_head;
    temp = temp->next;

    for (i = num1+1; i <= num2; i++)
    {
        new_node = (List*)malloc(sizeof(List));
        new_node->next = NULL;
        new_node->line = (char*)malloc(strlen(temp->line));
        strcpy(new_node->line, temp->line);

        prev->next = new_node;
        prev = new_node;
        temp = temp->next;
    }

    for (i = 1; i < num3; i++)
    {
        temp2 = temp2->next;
    }

    prev->next = temp2->next;
    temp2->next = dummy_head;
    

    return head;
}


void findPatern(List *head, int num1, int num2)
{
    List *temp1 = head;
    char str[20];
    int i, count1, count2, j, flag;
    printf("Enter patern :");
    fgets(str, 20, stdin);

    count2 = strlen(str);

    for (i = 0; i < num1; i++)
    {
        temp1 = temp1->next;
    }

    for (i = num1; i <= num2; i++)
    {
        count1 = strlen(temp1->line);

        for (i = 0; i <= count1 - count2; i++)
        {
            for (j = i; j < i + count2; j++)
            {
                flag = 1;
                if (temp1->line[j] != str[j - i])
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                break;
        }
        if (flag == 1)
        {
            printf("%s", temp1->line);
            break;
        }
        temp1 = temp1->next;
    }  

    if(flag == 0)
        printf("Patern Not Found");
}

void helpOfAllCommand()
{
    int choice;
    printf("HELP SECTION");

    do
    {
        printf("1 : \'p\' command\n");
        printf("2 : \'i\' command\n");
        printf("3 : \'a\' command\n");
        printf("4 : \'d\' command\n");
        printf("5 : \'m\' command\n");
        printf("6 : \'c\' command\n");
        printf("7 : \'f\' command\n");
        printf("8 : \'s\' command\n");
        printf("9 : \'q\' command\n");
        printf("10 : Exit from Help section\n");

        printf("\nEnter your choice :");
        scanf("%d",&choice);

        switch (choice)
        {
            case 1:
            {   
                printf("p stands for print command\n");
                printf("This command can be given in 3 different ways\n");
                printf("p : This will print first line\n\n");
                printf("p m: This will print m\'th line where m is a integer value\n");
                printf("m must me between 1 and total no of lines in the file\n\n");
                printf("p m n: This will print lines from m to n where m and n are integer value\n");
                printf("Here m must be less than n. If value of n is greater than total no of lines then it will print lines at the end\n\n");

            }break;

            case 2:
            {
                printf("i stands for insert command\n");
                printf("This command requires one integer parameter and one line\n");
                printf("The command is = i m\n");
                printf("m is integer parameter ranges from 1 to total no of lines");
                printf("This command will insert line at m\'th position\n\n");
            }break;

            case 3:
            {
                printf("a is append command");
                printf("It attaches line at the end\n");
                printf("only give command = a\n");
                printf("No numeric parameter\n\n");
            }break;

            case 4:
            {
                printf("d = delete command\n");
                printf("d n = will delete n\'th line\n");
                printf("d m n = will delete line from m to n");
                printf("m and n are integer and m must be less than n\n\n");
            }break;

            case 5:
            {
                printf("m is symbol of move command\n");
                printf("move command require mininmum 2 integer parameter\n");
                printf("m n1 n2 = moves line no n1 to line no n2\n");
                printf("m n1 n2 n3 = moves line no from n1 to n2 to n3\n\n");
            }break;

            case 6:
            {
                printf("c is copy command\n");
                printf("copy command require mininmum 2 integer parameter\n");
                printf("c n1 n2 = copies line no n1 and paste it after n2\n");
                printf("c n1 n2 n3 = copies line from n1 to n2 and paste it after n3\n\n");
            }break;

            case 7:
            {
                printf("f = find command takes 2 integer arguments\n");
                printf("If you want to find the string present in the file or not then use this command\n");
                printf("f m n = after giving  this command you will ask to enter a string\n");
                printf("If the string is present in the specified range of line then the corresponding line get printed\n\n");
            }break;

            case 8:
            {
                printf("use s command to save the changes made in the file\n\n");
            }break;

            case 9:
            {
                printf("Use this command to exit the editor\n");
                printf("Just type q on line editor pallet\n\n");
            }break;

            case 10:break;
            
            default:printf("Invalid choice");
                break;
        }

    } while (choice != 10);
    
}

// void help_func()
// {

//     printf("Procedure : ");
//     printf("\n Editor(Main)");
//     printf("\n Description : ");
//     printf("Input – optionally the filename \n Perform initializations \n Read from the file optionally Count and displaythe line count Start the command loop");
//     printf("\nProgramming Hints : ");
//     printf("\n main( int argc, char *argv[])");
//     printf("\n if(argc >1) { readbuff(head, argv[1]);");
//     printf("\n printf( \"Lines: %%d\", lines(head));");
//     // printf("\n main( int argc, char *argv[]) \n if(argc >1) { readbuff(head, argv[1]); \n printf( \“Lines\: %%d\”,lines(head));");
    
//     printf("\n Procedure : ");
//     printf("\n Initializations : ");
//     printf("\n Description : ");
//     printf("\n Initializing Linked List");
//     printf("\n Programming Hints : ");
//     printf("head = (List *) malloc (sizeof ( List *)); \nhead->next=null; \nlast=head;");

//     printf("\n Procedure : ");
//     printf("\n Read Text File : ");
//     printf("\n Description : ");
//     printf("\n Input - list header and file name \nOpen the file in read mode \nInitially last points to head while file not the end of file read a line from the file \ncreate a new node by allocating memory \nAllocate memory to string copy the line \nAttach the newnode to last \nLet last point to newnode");
//     printf("\n Programming Hints : ");
//     printf("\n void readbuff(List *head, char *filename) \nIf( (fp=fopen(filename, “r+”))!=NULL) \n{ last =head;\nwhile(!feof(fp)) { \nif(!fgets(str,80,fp)) \nbreak; \ntemp = temp->line=(char malloc(strlen(str)); \nstrcpy(temp->line,str); \nlast->next=temp; \nlast=temp; }");
    
//     printf("\n Procedure : ");
//     printf("\n Count Lines : ");
//     printf("\n Description : ");
//     printf("\n Input – linked list header Output – no of lines \n Start from the first node Traverse the list and increment the count");
//     printf("\n Programming Hints");
//     printf("\n int lines(List *head) \n temp=head->next; while(temp !=null) { .... }");

//     printf("\n Procedure : ");
//     printf("\n Count Lines : ");
//     printf("\n Description : ");
//     printf("\n Input – linked list header Output – no of lines");
//     printf("\n Programming Hints : ");
//     printf("temp=head->next; \nwhile(temp !=NULL) { .... }");

//     printf("\n Procedure : ");
//     printf("\n Command Loop : ");
//     printf("\n Description : ");
//     printf("Start the loop \nPrompt \nRead the command \nSeparate the parameters \nBranch depending on the command character \nExit the program on quit command");
//     printf("Programming Hints : ");
//     // printf("while(1){ \nprintf("?"); \nfgets(str,80,stdin); \n n=sscanf(str,"%%c%%d%%d%%d",\n &c,&n1,&n2,&n3); \n switch(c) \n{ case 'p': \n …………………………….. \n case 'q': exit(0); \ndefault : printf("wrong command"); \nbreak; \n }}");

//     printf("\n Procedure : ");
//     printf("\n Print : ");
//     printf("\n Description : ");
//     printf("Input - list and two integer parameters n1,n2 \n validate n1 , n2 and set default values \n Skip n1-1 lines \nPrint lines from n1 to n2 \n Line no : followed by line");
//     printf("Programming Hints : ");
//     printf("void eprint(List *head, int n1, int n2)");
//     /*printf("\n for(line=1, temp=head->next ; line<n1; line++) \n temp=temp->next; \nfor(…) { \n printf("line no \%d \: \%s" ,line, temp->line)");*/
// }