import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int[] count = new int[26];
		int i,j,flag=0; 
		for(i=0;i<s1.length();i++)
		{
			count[s1.charAt(i)-'a']++;
			count[s2.charAt(i)-'a']--;
		}
		for(i=0;i<26;i++)
		{
			if(count[i]!=0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not a Anagram");
		}
		else
		{
			System.out.println("Anagram");
		}
	}
}
