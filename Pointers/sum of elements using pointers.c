#include<stdio.h> 
int main()
{
	int arr[5];   
	int i,sum;
	int* ptr = arr;
	sum=0;
	for(i=0;i<5;i++)
	{
		scanf("%d",(ptr+i));
	}
	for(i=0;i<5;i++)
	{
		sum = sum+*(arr+i);
	}
	printf("Sum: %d",sum);
}
