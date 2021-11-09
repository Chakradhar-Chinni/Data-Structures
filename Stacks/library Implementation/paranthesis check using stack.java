import java.util.*;
class stack
{
	public static boolean matching(char a,char b)
	{
		return ((a=='('&&b==')') || (a=='['&&b==']') || (a=='{'&&b=='}'));
	}
	public static boolean isBalanced(String str)
	{
		Stack<Character> s= new Stack<>();
		int i;
	  for(i=0;i<str.length();i++)
	  {
	    if (str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{')
	    {
	      s.push(str.charAt(i));
	    }
	    else
	    {
		    if(s.isEmpty()==true)
		    		return false;
			else if(matching(s.peek(),str.charAt(i))==false)
			    	return false;
			else
			   	s.pop(); 
		}
	  }
	  return (s.isEmpty()==true);
	}
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  if(isBalanced(str))
	  		System.out.println("Balanced");
	  else
	  		System.out.println("UnBalanced");
	}
}
