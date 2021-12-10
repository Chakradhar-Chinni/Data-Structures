import java.util.*;
class Main
{
    public static int[] func(int n, int[] arr,int d)
    {
        int i,j;
        int value;
        for(j=0;j<d;j++)
        {
            value = arr[0];
            for(i=0;i<n-1;i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = value;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int i;
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for(i=0;i<n;i++)		{
			arr[i] = sc.nextInt(); }

		arr = func(n,arr,d);
		for(i=0;i<n;i++)
		    System.out.print(arr[i]+" ");
    }
}

/* Test Cases
Input:
5 2
1 2 3 4 5
Output: 3 4 5 1 2
Input:
4 3
10 5 30 15
Output: 15 10 5 30
*/
