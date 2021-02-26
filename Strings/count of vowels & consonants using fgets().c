#include<stdio.h>
int main()
{
	int n=6,i,vc,cc;
	char s[10];
	char* ptr; //pointer to a character
	ptr=s;
	vc=0,cc=0;
	printf("Enter a String: ");
	fgets(s,n,stdin);
	printf("String is: %s\n",s);
  
      while(*ptr!='\0')
      {
          if(*ptr=='a'||*ptr=='A'||*ptr=='e'||*ptr=='E'||*ptr=='i'||*ptr=='I'||*ptr=='o'||*ptr=='O'||*ptr=='u'||*ptr=='U')
          {
            vc++;
          }
          else
          {
            cc++;
          }
        ptr++;
      }
      
	printf("Vowel(s) Count: %d\n",vc);
	printf("Consonant(s) Count: %d",cc);
}
