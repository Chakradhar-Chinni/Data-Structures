//Naive Approach 
//TC: O(n^2)
import java.util.Scanner;
public class leaders_in_an_array 
{
	static int func(int n,int[] arr,int[] leader)
	{
		int i,j,k,flag;
		k=0;
		for(i=0;i<n;i++)
		{
			flag=0;
			for(j=i+1;j<n;j++)
			{
				if(arr[i] < arr[j]) 
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				leader[k] = arr[i];
				k++;
			}     
		}
		return k;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] leader = new int[n];
		int i;
		for(i=0;i<n;i++) 
		{
			arr[i] = sc.nextInt();  
		}
		int k = func(n,arr,leader);
		System.out.println("Leaders are:");
		for(i=0;i<k;i++)
		{
			System.out.println(leader[i]);
		}
	}
}

//Efficient Approach
import java.util.Scanner;
import java.util.*;
public class Main
{
    static ArrayList<Integer> leaders(int n,int[] arr,ArrayList<Integer> rarr)
    {
        int i,j,k=1;
        rarr.add(arr[n-1]);  //last element is leader
        int curr_leader = arr[n-1];
        for(i=n-2;i>=0;i--)
        {
            if(arr[i]>curr_leader)
            {
                curr_leader = arr[i];
                rarr.add(curr_leader);
            }
        }
        return rarr;
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    ArrayList<Integer> rarr = new ArrayList<Integer>();
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	     rarr = leaders(n,arr,rarr);
	     
	     System.out.println("Leaders\n");
	     Iterator itr = rarr.iterator();
	     while(itr.hasNext())
	     {
	        System.out.print(itr.next()+" ");
	     }
	}
}

