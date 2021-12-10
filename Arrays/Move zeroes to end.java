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
//---------------
//Efficient Approach
//TC: Linear Time
import java.util.Scanner;
import java.io.*;
public class move_zeroes_to_end 
{
	static void func(int[] arr,int n)
	{
		int temp,i,count=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		func(arr,n);
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
/*
	Best Approach -> Explanation
	Initialize count variable to zero
	If the array element is not equal to zero, perform swap between arr[i],arr[count] and increment the value of count
	count variable indicates the count of non-zero elements
/*
Test Cases
Input
6
8 5 0 10 0 20
Output:  8 5 10 20 0 0 
Input
5
0 0 0 10 0
Output: 0 0 0 0 10
Input
2
10 20
Output: 10 20
*/
