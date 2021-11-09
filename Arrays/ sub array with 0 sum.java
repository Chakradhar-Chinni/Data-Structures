//Naive Approach
import java.util.*;
class codechef
{
    public static boolean func(int[] arr,int n)
    {
        int i,j,value=0;
        for(i=0;i<n-1;i++)
        {
            value = arr[i];
            for(j=i+1;j<n;j++)
            {
                value = value + arr[j];
                if(value==0)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int[] arr = new int[n];
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean r = func(arr,n);
        System.out.println(r);
    }
}
//
//Efficient Approach 
//Using Hashing
import java.util.*;
class Subzero
{  //edit code
	public Boolean perform(int[] arr,int n)
	{
		int i,pre_sum=0;        
		HashSet<Integer> set = new HashSet<Integer>();  
		for(i=0;i<n;i++)
		{
			pre_sum = pre_sum+arr[i];
			if(set.contains(pre_sum))
			{
				return true;
			}
			if(pre_sum==0)
            {
                return true;
            }
			set.add(pre_sum);
		}
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Subzero obj = new Subzero();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();	}
		System.out.println(obj.perform(arr,n));
	}
}
