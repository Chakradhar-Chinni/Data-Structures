import java.util.*;
class Main
{
    public static int[] func(int n, int[] arr)
    {
        int i,j;
        int value = arr[0];
        for(i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = value;
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
TestCases:
Input:
2
10 20
Output: 20 10
5
13 45 24 5 87
Output: 45 24 5 87 13 
*/
