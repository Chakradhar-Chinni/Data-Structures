#include<stdio.h>
int main()
{
	 int r,c,i,j,count=0;
	 scanf("%d%d",&r,&c);
	 int arr[r][c];
	 int rc[r];
	 
	 for(i=0;i<r;i++)
	 {
	 	for(j=0;j<c;j++)
		 	{
		 		scanf("%d",&arr[i][j]);
			}
	 }
	 
	 for(i=0;i<r;i++)
	 {
	 	for(j=0;j<c;j++)
		 	{
		 		if(arr[i][j]==1)
		 		{
		 			count++;
				}
			}
			rc[i] = count;
			count=0;
	 }
	 
	 printf("----Output----\n");
	 for(i=0;i<r;i++)
	 {
	 		printf("Count of 1's in Row[%d]: %d\n",(i+1),rc[i]);
	 }
}
