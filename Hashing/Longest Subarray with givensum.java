//Naive Approach
import java.util.*;
class Main
{
    public static int func(int n, int[] arr, int sum)
    {
        int i,j,t_len=0,t_sum=0,len=0;
        for(i=0;i<n-1;i++)
        {
            t_sum = arr[i];
            t_len++;
            for(j=i+1;j<n;j++)
            {
                if(t_sum==sum){
                    len = Math.max(len,t_len); }
                t_sum = t_sum + arr[j];
                t_len++;
            }
            t_len=0;
        }
        return len;
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();}
        int res =func(n,arr,sum);
        System.out.println(res);
    }
}
//Efficient Approach
//Test Cases:
Input:
7 0
5 8 -4 -4 9 -2 2
Output: 3
 
Input:
8 5
3 1 0 1 8 2 3 6
Output: 4
 
Input:
3 15
8 3 7
Output: 0
