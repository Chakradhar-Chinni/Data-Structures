//Naive Approach
import java.util.*;
class Main
{
    public static boolean func(int n,int[] arr,int sum)
    {
        int j,i,t_sum;
        for(i=0;i<n-1;i++)
        {
            t_sum = arr[i];
            for(j=i+1;j<n;j++)
            {
                t_sum = t_sum+arr[j];
                if(t_sum==sum)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();}
        boolean res =func(n,arr,sum);
        System.out.println(res);
    }
}

Test Cases
Input:
6 22
5 8 6 13 3 -1
Output: true

Input
7 3
15 2 8 10 -5 -8 6
Output: true

Input:
4 10
3 2 5 6
Output: true
