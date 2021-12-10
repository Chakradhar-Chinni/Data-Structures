import java.util.*;
import java.io.*;

class Main
{
    public static int func(int[] arr1,int[] arr2)
    {
        int i,j;
        int n1 = arr1.length;
        int n2 = arr2.length;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        
        return set.size();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
		int i;
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(i=0;i<n1;i++)		{
			arr1[i] = sc.nextInt(); }
		for(i=0;i<n2;i++)		{
			arr2[i] = sc.nextInt(); }

		int res = func(arr1,arr2);
		System.out.println(res);
    }
}
/*
Test Cases
Input:
4 5
15 20 5 15
15 15 15 20 10
Output: 4
Input:
3 2
10 12 15
18 12
Output: 4
Input: 
3 2
3 3 3
3 3
Output: 1
*/
