import java.util.Scanner;
public class Main
{
    static int maxwindow(int k,int n,int[] arr)
    {
        int i,j;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        
        for(i=0;i<k;i++)  //Computing 1st window sum
        {
            curr_sum = curr_sum+arr[i];
        }
        for(i=k;i<n;i++)  //Computing remaining window sum
        {
            curr_sum = curr_sum + (arr[i]-arr[i-k]);
            if(curr_sum>max_sum)
                max_sum = curr_sum;
        }    
        return max_sum;
    }
	public static void main(String[] args) 
	{
	     int n,i,k;
	     Scanner sc = new Scanner(System.in);
	     n = sc.nextInt();
	     int[] arr = new int[n];
	     k = sc.nextInt();
	     for(i=0;i<n;i++)
	     {
	         arr[i] = sc.nextInt();
	     }
	     int sum = maxwindow(k,n,arr);
	     System.out.println(sum);
	}
}
