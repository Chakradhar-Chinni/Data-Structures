#include<stdio.h>
#include<stdbool.h>
bool search(int arr[],int n,int key)
{
	int i;
	for(i=0;i<n;i++)
	{
		if(arr[i]==key)
			return 1;
	}
	return 0;
}
int main()
{
	int i,n,key,flag=0;
	scanf("%d%d",&n,&key);
	int arr[n];
	for(i=0;i<n;i++)
	{
	 scanf("%d",&arr[i]);
	}
	bool r = search(arr,n,key);
	if(r)
		printf("Value is found");
	else
		printf("Value is not found");
}
