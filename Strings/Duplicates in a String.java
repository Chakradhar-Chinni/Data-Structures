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
