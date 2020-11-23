#include<stdio.h>
#include"smaco_simulator_functions.h"

int main(int argc, char const *argv[])
{
    int choice;
    
    do
    {
        printOptions();
        printf("\n\nEnter your choice :");
        scanf("%d",&choice);
        switch (choice)
        {
            case 1:
            {
                loadProgramIntoMemory(argv[1]);
            }break;

            case 2:
            {
                printProgram();
            }break;

            case 3:
            {
                runProgram();
            }break;

            case 4:
            {
                acceptProgram();
            }break;

            case 5:
            {
                printf("Program traced sucessfully");
            }break;

            case 6:
            {
                printf("Leaving program ...");
            }break;

            default:printf("Invalid choice");
                break;
        }
    } while (choice != 6);
    

    return 0;
}
