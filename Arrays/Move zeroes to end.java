//Naive Approach 
//TC: O(n^2)
import java.util.Scanner;
import java.io.*;
public class move_zeroes_to_end 
{
	static void func(int[] arr,int n)
	{
		int size=0,i,v,j=0;
		int[] temp = new int[n];
		for(i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				temp[j] = arr[i];
				j++;
			}
		}
		for(i=0;i<j;i++)
		{						
			arr[i] = temp[i];
		}
		for(j=i;j<n;j++)
		{
			arr[j]=0;
		} 
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter Array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter"+ n+"Array Elements");
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("--Array--");
		func(arr,n);
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
