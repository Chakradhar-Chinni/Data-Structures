import java.util.*;
class prefixeval
{
	public static int prefixeval(String str)
	{
		Stack<Integer> s = new Stack<>();
		char ch='\0';
		for(int i=str.length()-1;i>=0;i--)
		{
			ch = str.charAt(i);

		  	if(Character.isLetterOrDigit(ch))
		  	{
		  		s.push(ch-'0');
		  	}
		  	else
		  	{
		  		int val1 = s.pop();
		  		int val2 = s.pop();
				switch(ch)
				{
				  case '+':
				  		s.push(val1+val2);
				  		break;
				  case '-':
				  		s.push(val1-val2);
				  		break;
				  case '*':
				  		s.push(val1*val2);
				  		break;
				  case '/':
				  		s.push(val1/val2);
				  		break;
				}
		  	}
		}
		return s.peek();
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		System.out.print(prefixeval(exp));
	}
}
