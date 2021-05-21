//Naive Approach
//Returning the index of the left most repeating character, if there is no repeating character return -1
import java.util.Scanner;
public class Main 
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
