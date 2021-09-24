//O(n^2)
import java.util.*;
class Sort
{
	public static void main(String[] args)
	{                                          
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,count=0;
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();	}
		for(i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(i=0;i<n;i++)
		{
			if(i<count)
			{
				arr[i] = 0;
			}
			else
			{
				arr[i] = 1;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
//O(n)
import java.util.*;
class Sort
{
	public static void main(String[] args)
	{                                          
		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,count=0;
		int[] arr = new int[n];
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();	}
		int left = 0;
		int right = n-1;
		while(left<right)
		{
			if(arr[i]==0)
			{
				left++;
			}
			if(arr[i]==1)
			{
				right--;
			}
			if(left<right)
			{
				arr[left]=0;
				arr[right]=1;
				left++;
				right--;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
