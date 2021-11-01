import java.util.*;
class JavaQueue
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new ArrayDeque<Integer>();
		//Queue<Integer> q = new ArrayDeque<Integer>();

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.print(q);
	}
}
