#include <stdio.h>
int main() 
{      
    int max_so_far=0;   
    int max_ending_here=0;   
      
    int arr[8] = {-2,-3,4,-1,-2,1,5,3}; 
    
    for(int i=0;i<8;i++)
    {
       //for(int j=i;j<8;j++)
       //{
           int temp = max_ending_here+arr[i]; 
           if(temp>0){
           max_ending_here = max_ending_here+arr[i];}
           if(max_so_far<max_ending_here)
           {
               max_so_far = max_ending_here;
           }
       //}
    }
    printf("%d",max_so_far);
}
 
