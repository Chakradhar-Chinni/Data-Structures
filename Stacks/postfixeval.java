import java.util.*;
class postfixeval
{
	public static int postfixeval(String str)
	{
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
		  char ch = str.charAt(i);

		  if(Character.isDigit(ch))
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
			       	s.push(val2+val1);
			       	break;
			   case '-':
			   		s.push(val2-val1);
			   		break;
			   case '*':
			   		s.push(val2*val1);
			   		break;
			   case '/':
			   		s.push(val2/val1);
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
		System.out.print(postfixeval(exp));
	}
}
