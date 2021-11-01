import java.util.*;
class stringrotations
{
	public boolean perform(String A,String B)
	{
		A = A+A;
		if(A.indexOf(B)>=0)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		stringrotations obj = new stringrotations();
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();
		System.out.print(obj.perform(A,B));
	}
}
