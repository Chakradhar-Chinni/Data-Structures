public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i;
		int[] count = new int[26];
		for(i=0;i<s.length();i++) 
		{
			count[s.charAt(i)-'a']++;
		}
		for(i=0;i<26;i++)
		{
			if(count[i]>1)
			{
				System.out.println((char)(i+'a')+ " "+count[i]);
			}
		}
	}

	
//Approach 2
import java.util.Scanner;
public class duplicate_in_string 
{
	static void dup(String str)
	{
		int i,j;
		int[] freq = new int[str.length()];
		StringBuilder s = new StringBuilder();
		for(i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					freq[i]++;
				}
			}
			if(freq[i]>1)
			{
				s.append(str.charAt(i));
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		dup(str);
	}
}
