import java.util.Scanner;

public class Naive_Pattern_Search {
	static int nps(String text,String pattern)
	{
		int i,j;
		for(i=0;i<=(text.length()-pattern.length());i++)
		{
			for(j=0;j<pattern.length();j++)
			{
				if(pattern.charAt(j)!=text.charAt(i+j))  //sliding through text
				{	
					break;
				}
			}
			if(j==pattern.length()) //if entire pattern is matched
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String pattern = sc.nextLine();
		System.out.println(nps(text,pattern));
	}

}
