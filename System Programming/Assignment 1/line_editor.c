#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"line_editor_functions.h"

int main(int argc, char const *argv[])
{
    List *head;
    int total_lines= 0, n, n1, n2, n3;
    char c, str[80];

    head = readBuffer(argv[1]);
    total_lines = lines(head);
    printf("\n\nNumber of lines in the file are %d",total_lines);

    do
    {
        n1 = n2 = 0;
        printf("\n?_Line Editor>");
        fgets(str, 80, stdin);

        n = sscanf(str,"%c%d%d%d",&c,&n1,&n2,&n3);

        if (n1 == 0)
        {
            n1 = n2 = 1;
        }
        else if (n2 == 0)
        {
            n2 = n1;
        }
        
        if (n2 > linesCount(head))
        {
            n2 = linesCount(head);
        }
        
        

        // printf("command = %c \n number = %d \n number 1 = %d \n number 2 = %d \n number 3 = %d\n\n", c, n,  n1, n2, n3);

        switch (c)
        {

            case 'a':
            {
                if(n == 1)
                {
                    head = appendLine(head);
                    printf("Line appended successfully");
                }
                else
                {
                    printf("Error executing append command");
                }
                
            }break;

            case 'p':
            {
                if (n1 > n2)
                {
                    printf("Invalid print command n1 must be less than n2");
                }
                else
                {
                    if(n1 <= 0 || n2 <= 0)
                    {
                        printf("Invalid print command n1 and n2 must be greater than 0");
                    }
                    else
                    {
                        display(head, n1, n2);
                    }
                }
                
            }break;

            case 'i':
            {
                if (n == 2)
                {
                    if(n1 <= 0)
                    {
                        printf("Invalid insert command n1 must be greater than 0");
                    }
                    else
                    {
                        head = insert(head, n1);
                        printf("Line inserted successfully at position %d",n1);
                    }
                    
                }
                else
                {
                    printf("Insert command takes one and only one numeric parameter");
                }
            }break;

            case 'f':
            {
                if(n == 3)
                {
                    if(n1 <= 0 || n2 <= 0)
                    {
                        printf("Invalid Find command n1 and n2 must be greater than 0");
                    }
                    else
                    {
                        findPatern(head, n1, n2);
                    }
                }
                else
                {
                    printf("Error executing the find command");
                }
                
            }break;

            case 'm':
            {
                if (n == 3)
                {
                    if(n1 <= 0 || n2 <= 0)
                    {
                        printf("Invalid move command n1 and n2 must be greater than 0");
                    }
                    else 
                    {
                        head = moveSingleLine(head, n1, n2);
                        printf("Line %d moved to line %d", n1, n2);
                    }
                }
                
                else if (n == 4)
                {
                    if(n1 <= 0 || n2 <= 0 || n3 <= 0)
                    {
                        printf("Invalid move command n1, n2 and n3 must be greater than 0");
                    }
                    else
                    {
                        head = moveMultipleLines(head, n1, n2, n3);
                        printf("Lines from %d to %d moved to %d successfully",n1, n2, n3);    
                    }
                }
                else
                {
                    printf("Error executing move command");
                }
                
            }break;

            case 's':
            {
                save(head);
            }break;

            case 'd':
            {
                if(n == 2)
                {
                    if(n1 <= 0)
                    {
                        printf("Invalid delete command n1 must be greater than 0");
                    }
                    head = deleteSingleLine(head, n1);
                    printf("Line no %d deleted successfully",n1);
                }

                if(n == 3)
                {
                    if(n1 <= 0 || n2 <= 0)
                    {
                        printf("Invalid delete command n1 and n2 must be greater than 0");
                    }
                    else
                    {

                        head = deleteMultipleLine(head, n1, n2);
                        printf("Lines from %d to %d are deleted successfully",n1,n2);
                    }
                }
            }break;

            case 'c':
            {
                if(n == 4)
                {
                    if(n1 <= 0 || n2 <= 0 || n3 <= 0)
                    {
                        printf("Invalid copy command n1 n2 and n3 must be greater than 0");
                    }
                    else
                    {
                        head = copy(head, n1, n2, n3);
                        printf("Contents from %d to %d copied to %d", n1, n2, n3);
                    }
                }
                else
                {
                    printf("Error executing copy command");
                }
                
            }break;

            case 'h':
            {
                helpOfAllCommand();
            }

            case 'q':
                break;


            default: printf("Wrong command");
                break;
        }

    } while (c != 'q');
    

    return 0;
}
