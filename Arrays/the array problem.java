import java.util.*;
class codechef
{
	static void computesum(int n,int[] arr)
	{
		int i,j,sum;
		int[] ans = new int[n];
		for(i=0;i<n;i++)
		{
		  sum=0;
		  for(j=0;j<n;j++)
		   {
		     if(j!=i)
			sum = sum+arr[j];
             	   }
		   ans[i] = sum;
		}
	     for(i=0;i<n;i++)
		System.out.println(ans[i]);
	}
   public static void main(String[] args)
   {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
           arr[i] = sc.nextInt();
	computesum(n,arr);
   }
}
