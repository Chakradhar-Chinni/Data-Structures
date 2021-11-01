import java.util.*;
class infixtopostfix
{
	static int Prec(char ch)
	{
		switch(ch)
		{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
		}
		return -1;
	}
	public static String infixtopostfix(String exp)
	{
		Stack<Character> s = new Stack<>();
		String result = "";      //check flag
		for(int i=0;i<exp.length();i++)
		{
			char ch = exp.charAt(i);
			if(Character.isLetterOrDigit(ch)){
				result = result+ch;
			}
			else if(ch=='('){
				s.push(ch);
			}
			else if(ch==')')
			{
			    while(!s.isEmpty() && s.peek()!= '(')
			    		result += s.pop();
			    s.pop();
			}
			else
			{
			    while(!s.isEmpty() && Prec(ch)<=Prec(s.peek()) )
			    	result += s.pop();
				s.push(ch);
			}
			
		}
		while (!s.isEmpty())
		{
            if(s.peek() == '(')
                return "Invalid Expression";
            result += s.pop();
         }
       return result;
 }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
		System.out.println(infixtopostfix(exp));
	}
}
