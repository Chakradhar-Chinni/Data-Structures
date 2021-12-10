import java.util.*;
class Main
{
    public static int[] func(int n, int[] arr)
    {
        int i,j,temp;
        j = n-1;
        for(i=0;i<n/2;i++)
        { 
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)		{
			arr[i] = sc.nextInt(); }

		arr = func(n,arr);
		for(i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
    }
}

/*
Test Cases:
Input:
5
1 2 3 4 5
Output: 5 4 3 2 1
Input:
4
1 2 3 4
Output: 4 3 2 1
*/
