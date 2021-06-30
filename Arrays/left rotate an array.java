import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n,i,temp,d;  //d-> left rotate count
	    n = sc.nextInt();
	    d = sc.nextInt();
	    int arr[] = new int[n];
	    for(i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    System.out.println("\n");
	    
	    while(d!=0)
	    {
	        temp = arr[0];
	        for(i=1;i<n;i++)
	        {
	            arr[i-1] = arr[i];
	        }
	        i--;
	        arr[i] = temp;
	        d--;
	    }
	    
	    for(i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    
	}
}
