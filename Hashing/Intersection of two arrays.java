//Naive Approach
import java.util.*;
class Main
{
    public static int function(int[] arr1,int[] arr2)
    {
        int i,j,count=0;
        boolean flag;
        for(i=0;i<arr1.length;i++)
        {
            flag = false;
            for(j=0;j<arr2.length;j++)
            {
                
                if(arr1[i]==arr2[j] && arr2[j]!=-1)
                {
                    arr2[j] = -1;
                    if(flag==false){
                    count++;
                    flag=true;    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        
        for(int i=0;i<n1;i++) {
            arr1[i] = sc.nextInt(); }
        for(int i=0;i<n2;i++) {
            arr2[i] = sc.nextInt(); }
            
        int res = function(arr1,arr2);
        System.out.println(res);
    }
}

//Efficient Approach
import java.util.*;
class Main
{
    public static int function(int[] arr1,int[] arr2)
    {
        int i,count=0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for(i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                set.remove(arr2[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        
        for(int i=0;i<n1;i++) {
            arr1[i] = sc.nextInt(); }
        for(int i=0;i<n2;i++) {
            arr2[i] = sc.nextInt(); }
            
        int res = function(arr1,arr2);
        System.out.println(res);
    }
}

/*Test Cases
Sample Input
7
4
10 15 20 15 30 30 5
30 5 30 80
    Output: 2
    */
