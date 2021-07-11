//Naive Approach
//TC: O(n^2)
import java.util.Scanner; 
public class Main
{
    static int max1s(int[] arr,int n)
    {
        int i,j,curr_count=0,max_count=0,flag=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(arr[j]==1)
                {
                    curr_count++;
                }
                else
                {
                    break;
                }
            }
            if(curr_count > max_count)
            {
                max_count = curr_count;
            }
            curr_count=0;
        }
        return max_count;
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
    	int max = max1s(arr,n);
    	System.out.println("\n"+max);
	}
}
//Efficient Approach
//TC: Linear Time O(n)
import java.util.Scanner;
public class Main
{
    static int maxconsecutive1s(int[] arr,int n)
    {
        int i,j,curr_count=0,max_count=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
                curr_count=0;
            else
                curr_count++;
                if(curr_count>max_count)
                {
                    max_count = curr_count;
                }
        }
        return max_count;
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
		int max = maxconsecutive1s(arr,n);
		System.out.println("\n"+max);
	}
}
