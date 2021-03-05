#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int i,count;
    count=1;
    
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i]==' ' && str[i+1]!=' ')
        {
            count++;
        }
    }
    printf("%d",count);
}
