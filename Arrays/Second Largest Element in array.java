//Naive Approach
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int[] arr = {13,9,23,8,19};
        int i,max,smax,max_index,smax_index;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)        {
            arr[i] = sc.nextInt();    }
            
        
        max = Integer.MIN_VALUE;
        max_index = Integer.MIN_VALUE;
        smax = Integer.MIN_VALUE;
        smax_index = Integer.MIN_VALUE; 
        
        for(i=0;i<arr.length;i++)    {
            if(arr[i]>max)  {
                max = arr[i];
                max_index = i;  }}
        
        for(i=0;i<arr.length;i++){
            if(arr[i]!=max && arr[i]>smax){
                smax = arr[i];
                smax_index = i;   }}
        
        System.out.println("Maximum element: "+max);
        System.out.println("Second Maximum: "+smax);
        System.out.println("Max. Index: "+max_index);
        System.out.println("SMax. Index: "+smax_index);
    }
}

//Efficient Approach
import java.util.*; // index of second largest element
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int[] arr = {13,9,23,8,19};
        int i,max,smax,max_index,smax_index;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(i=0;i<n;i++)        {
            arr[i] = sc.nextInt();    }
            
        
        max = Integer.MIN_VALUE;
        max_index = Integer.MIN_VALUE;
        smax = Integer.MIN_VALUE;
        smax_index = Integer.MIN_VALUE; 
        
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                smax = max;
                smax_index = max_index;
                
                max = arr[i];
                max_index = i;
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
                smax_index = i;
            }
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Second Maximum: "+smax);
        System.out.println("Max. Index: "+max_index);
        System.out.println("SMax. Index: "+smax_index);
    }
}

/*TestCases
Input:
5
13 9 23 8 19
Output:
Maximum element: 23
Second Maximum: 19
Max. Index: 2
SMax. Index: 4
*/
