#include<stdio.h>
#include<string.h>
int main()
{
    int l1,l2,i,j,flag=0;
    char s1[10];
    char s2[10];
    char temp;
    scanf("%s%s",s1,s2);
    
    l1 = strlen(s1);
    l2 = strlen(s2);
 
    if(l1!=l2)
    {
        printf("Not anagrams!");
    }
    else
    {
        for(i=0;i<l1-1;i++)
        {
            for(j=i+1;j<l2;j++)
            {
                if(s1[i]>s1[j])
                {
                    temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
                if(s2[i]>s2[j])
                {
                    temp = s2[i];
                    s2[i] = s2[j];
                    s2[j] = temp;
                }
            }
        }

        for(i=0;i<l1;i++)
        {
            if(s1[i] != s2[i])
             {
               flag=1;
               break;
             }
        }
        if(flag==1)
            printf("Not Anagrams");
        else
            printf("Anagrams");
    }
}
