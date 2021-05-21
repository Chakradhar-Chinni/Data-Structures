import java.util.Scanner;

public class Improved_Naive_Pattern_Search 
{
	static void inps(String text,String pattern)
	{
		int i,j;
		for(i=0;i<(text.length()-pattern.length());)
		{
			for(j=0;j<pattern.length();j++)
			{
				if(pattern.charAt(j)!=text.charAt(i+j))
				{
					break;
				}
			}
			
			if(j==pattern.length())
			{
				System.out.println(i);
			}
			if(j==0)
			{
				i++;
			}
			else
			{
				i=i+j;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text = 	sc.nextLine();
		String pattern = sc.nextLine();
		inps(text,pattern);
	}
}
