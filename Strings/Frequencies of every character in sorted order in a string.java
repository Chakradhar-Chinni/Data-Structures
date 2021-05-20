import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] count = new int[26];
		int i;
		for(i=0;i<str.length();i++)
		{
			count[str.charAt(i)-'a']++;
		}
		for(i=0;i<26;i++)
		{
			if(count[i]>0)
			{
				System.out.println((char)(i+'a') + " "+count[i]);
			}
		}
	}
}
