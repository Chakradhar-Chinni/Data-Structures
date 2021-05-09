#include<stdio.h>   //printing sum of every row in a 2d matrix  
int main()   
{  
	int i,j,r,c,k=0,sum=0; 
	scanf("%d%d",&r,&c);
	int arr[r][c];
	int row_sum[r*c]; 
	
	for(i=0;i<r;i++)  
	{ 
		for(j=0;j<c;j++)
		{
			scanf("%d",&arr[i][j]);
		} 
	}
	
	 
	printf("---------Matrix---------\n\n"); //Printing the Matrix
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
	
	//Calculating sum of every row 
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			sum = sum+arr[i][j];
		}
		row_sum[k] = sum;  
		k++;
		sum = 0;
	}
	
	//Printing Sum of every row
	printf("\n----Sum of every Row----\n\n");
	for(i=0;i<k;i++)
	{
		printf("Sum of Row[%d] : %d\n",i+1,row_sum[i]);
	}
}
 
