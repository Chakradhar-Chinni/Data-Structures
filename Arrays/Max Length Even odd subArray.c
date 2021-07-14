//Naive Approach
//TC: O(n^2)
#include<stdio.h> //Maximum Length Even odd Sub array                
int max(int n,int arr[])
{
	int curr,i,j,res=1;
	for(i=0;i<n;i++) 
	{
		curr=1;
		for(j=i+1;j<n;j++)
		{ 
			if( (arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0) ) 
				curr++;
			else
				break;
		}
		if(curr>res)
			res = curr; 
	}
	return res;
}
int main()
{
	int i,n;
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
	  scanf("%d",&arr[i]);
	}
	int res = max(n,arr);
	printf("\n%d",res);
}

//Efficient Approach
//TC: Linear Time
#include<stdio.h> //Maximum Length Even odd Sub array                
int max(int n,int arr[])
{ 
	int i,j,curr=1,res=1;
	for(i=0;i<n;i++) 
	{
		if( (arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0) ) 
			curr++;
			if(curr>res)
				res = curr; 
		else
			curr=1;
	} 
	return res;
}
int main()
{
	int i,n;
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
	  scanf("%d",&arr[i]);
	}
	int res = max(n,arr);
	printf("\n%d",res);
}
