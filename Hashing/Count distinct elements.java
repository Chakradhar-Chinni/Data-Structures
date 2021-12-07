//Naive Approach 
import java.util.*;
class Main
{
    public static int function(int[] arr,int n)
    {
        int i,j,count=0;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            flag=false;
            for(j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j]) {
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                    count++;
                }
        }
        return count;
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
        int result = function(arr,n);
        System.out.println(result);
    }
}
