#include <stdio.h>
#include<string.h>
int main()
{
    int i,j;
    char s[10];
    char s1[10];
    j=0;
    scanf("%s",s);
   int l = strlen(s);
    
    for(i=0;i<l;i++)
    {
        if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z') ||s[i]==' ') 
        {
            s1[j] = s[i];
            j++;
        }
    }
    
    printf("%s",s1);
}
