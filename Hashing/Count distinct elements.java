//Naive Approach 
import java.util.*;
class Main
{
    public static int function(int[] arr,int n)
    {
        int i,j,count=0;
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            flag=false;
            for(j=i-1;j>=0;j--)
            {
                if(arr[i]==arr[j]) {
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                    count++;
                }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = function(arr,n);
        System.out.println(result);
    }
}

//Efficient Approach
import java.util.*;
class Main
{
    public static int function(int[] arr,int n)
    {
        int i;
        HashSet<Integer> set = new HashSet<Integer>();
        for(i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = function(arr,n);
        System.out.println(result);
    }
}
/*
Test Cases:
{15,12,13,12,13,13,18} -> 4
{10,10,10} -> 1
{10,20,30} -> 3
*/
