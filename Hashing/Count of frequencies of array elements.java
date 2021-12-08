 //Naive Approach
import java.util.*;
class Main
{
    public static int[] function(int n,int[] arr)
    {
        int i,j,count,k=0;
        int[] res = new int[n];
        boolean flag;
        for(i=0;i<n;i++)
        {
            flag=false;
            count=1;
            for(j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j] && arr[i]!=-1) {
                    count++;
                    arr[j]=-1;
                    flag=true; }
            }
            res[k++] = count;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] res = function(n,arr);
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=-1)
            {
                System.out.println(arr[i]+"::"+res[k]);
                k++;
            }
        }
    }
}



Test Cases
/*
Sample Input
8
10 12 10 15 10 20 12 12
Sample Output
10::3
12::3
15::1
20::1

*/
