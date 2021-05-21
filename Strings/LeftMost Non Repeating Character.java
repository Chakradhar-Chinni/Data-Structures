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
			if(count[s.charAt(i)]==1)
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
