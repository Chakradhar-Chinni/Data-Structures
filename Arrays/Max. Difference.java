//Naive Approach
import java.util.Scanner;
public class Main
{
    static int maxdiff(int n,int[] arr)
    {
        int i,j,temp,max_value=-9999;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                temp = arr[j] - arr[i];
                if(temp>max_value)
                {
                    max_value = temp;
                }
            }
        }
        return max_value;
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int i;
	    for(i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("\n"+maxdiff(n,arr));
	}
}
