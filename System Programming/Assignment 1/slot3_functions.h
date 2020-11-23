typedef struct editbuff
{
    char *line; // character string
    struct editbuff *next; // pointer to next line
    struct editbuff *prev; // pointer to prev line
}List;

List* readBuffer(char *filename)
{
    FILE *fp;
    char str[80];
    List *head, *last, *temp;
    head = (List*)malloc(sizeof(List));

    if( (fp=fopen(filename, "r+")) != NULL)
    { 
        head->next = NULL;
        head->prev = NULL;
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
            temp->prev = last;
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
    int cnt = 0;

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
    if(num1 < num2)
    {
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
    else
    {
        for(i = 1; i < num1; i++)
        {
            temp = temp->next;
            count += 1;
        }

        for (i = num1; i >= num2; i--)
        {
            printf("%d : %s",count, temp->line);
            temp = temp->prev;
            count -= 1;
        }
    }
    
}