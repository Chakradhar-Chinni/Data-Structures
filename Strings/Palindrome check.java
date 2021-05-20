public class Main
{
	public static void main(String[] args)
	{
		String s1 = "abdba";
		int begin=0,flag=1;
		int end = s1.length()-1;
		while(begin<end)
		{
			if(s1.charAt(begin)!=s1.charAt(end))
			{
				flag=0;
				break;
			}
			begin++;
			end--;
		}
		if(flag==1)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
