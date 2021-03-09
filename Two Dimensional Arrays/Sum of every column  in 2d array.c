#include<stdio.h>
int main()
{
	int r,c,i,j,sum=0,k=0;
	scanf("%d%d",&r,&c);
	int arr[r][c];
	int col_sum[r*c];
	//Scanning every element
	for(i=0;i<r;i++)
	{
	   for(j=0;j<c;j++)
	    {
		scanf("%d",&arr[i][j]);
	    }
	}
	
	printf("\n--Matrix--\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
			
	//Sum of every column
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			sum = sum+arr[j][i];
		}
		col_sum[k] = sum;
		k++;
		sum=0;
	}
	
	printf("\n\n--Column Sum--\n\n");
	for(i=0;i<k;i++)
	{
		printf("Column[%d] : %d\n",i+1,col_sum[i]);
	}
	
}


