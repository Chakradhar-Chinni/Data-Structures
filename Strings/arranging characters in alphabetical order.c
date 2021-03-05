#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int i,j;
    int l=strlen(str);
    char temp;
    for(i=0;i<l;i++)
    {
        for(j=i;j<l;j++)
        {
            if(str[i]>str[j])
            {
                temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
    printf("%s",str);
}

Another Approach
#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    scanf("%[^\n]s",str);
    int i,l;
    char temp;
    l = strlen(str);
    while(l-1)
    {
        for(i=0;i<l-1;i++)
        {
            if(str[i]>str[i+1])
            {
                temp = str[i] ;
                str[i] = str[i+1];
                str[i+1] = temp;
            }
        }
     l--;
    }
    printf("%s",str);
}
