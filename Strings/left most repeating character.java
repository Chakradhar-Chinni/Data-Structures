//Naive Approach
//Returning the index of the left most repeating character, if there is no repeating character return -1
import java.util.Scanner;
public class Naive_Approach 
{
	static int lmc(String s)
	{
		int[] count = new int[10];
		int i,j;
		for(i=0;i<s.length();i++)
		{
			for(j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(lmc(s));
	}
}
===================
import java.util.Scanner;

public class Better_Approach
{
	static int lmc(String s)
	{
		int[] count = new int[256]; //256 sized array to accept all ASCII values
		int i,j;
		for(i=0;i<s.length();i++)
		{
			count[s.charAt(i)]++;
		}
		for(i=0;i<s.length();i++)
		{
			if(count[s.charAt(i)]>1)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(lmc(s));
	}
}
