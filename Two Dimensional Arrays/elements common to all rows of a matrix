#include <stdio.h>
int main()
{
    int r,c,i,j;
    int v1,v2,v3,v4,cv1,cv2,cv3,cv4;
    scanf("%d%d",&r,&c);
    int arr[r][c];
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    v1 = arr[0][0];
    v2 = arr[0][1];
    v3 = arr[0][2];
    v4 = arr[0][3];
    
    cv1=0,cv2=0,cv3=0,cv4=0;
    
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {                 
            if(arr[i][j]==v1)
            {
                cv1++;
            }
            if(arr[i][j]==v2)
            {
                cv2++;
            }
            if(arr[i][j]==v3)
            {
                cv3++;
            }
            if(arr[i][j]==v4)
            {
                cv4++;
            }
        }
    }
    printf("Common element(s) to all rows of a matrix is/are:\n");
    if(cv1>=5)
    {
        printf("%d\t",v1);
    }
    if(cv2>=5)
    {
        printf("%d\t",v2);
    }
    if(cv3>=5)
    {
        printf("%d\t",v3);
    }
    if(cv4>=5)
    {
        printf("%d\t",v4);
    }
}
