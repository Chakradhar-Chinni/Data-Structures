#include<stdio.h>  //Storing elements in a matrix and printing it  Github
int main()
{
	int i,j,r,c;
	scanf("%d%d",&r,&c);   //r-row & c-column
	int arr[r][c];
	
	//Scanning the elements of a 2d matrix
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			 scanf("%d",&arr[i][j]);
		}
	}
	//Printing th2 2d matrix
	printf("\n\n--Matrix is--\n\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			printf("%d\t",arr[i][j]);
		}
		printf("\n");
	}
	
}
//Input must be given row wise
