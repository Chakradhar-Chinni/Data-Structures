//Naive Approach
import java.util.*;
class Main
{
    public static boolean func(int n,int[] array,int sum)
    {
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(array[i]+array[j]==sum)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        boolean res = func(n,arr,sum);
        System.out.println(res);
    }
}

//Efficient Approach
/*
-> a+b=c is same as c-a=b
For every array element, check if sum-arr[i] is present in hashset, if yes then return true
if not, then add current array element to hashset
*/
import java.util.*;
class Main
{
    public static boolean func(int n,int[] array,int sum)
    {
        int i;
        HashSet<Integer> set = new HashSet<Integer>();
        for(i=0;i<n;i++)
        {
            if(set.contains(sum-array[i]))
                return true;
                
            set.add(array[i]);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        boolean res = func(n,arr,sum);
        System.out.println(res);
    }
}
/*
TestCases
Input:
5 17
3 2 8 15 -8
Output: true
Input:
3 10
11 5 6
Output: false
*/
