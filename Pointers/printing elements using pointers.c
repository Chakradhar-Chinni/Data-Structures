#include<stdio.h> 
int main()
{
	int arr[5],i;
	int* ptr = arr;
	
	for(i=0;i<5;i++)
	{
	  scanf("%d",(ptr+i));
	}
	
	for(i=0;i<5;i++)
	{
	 printf("%d ",*(ptr+i));
	}
}
