//for pushing elements to stack
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
      Stack<Integer> s = new Stack<Integer>();   
      s.push(10);
      s.push(20);
      System.out.print(s);
    }
}

Output:
[10, 20]

//pop() removes top element
//peek() returns top element
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
      Stack<Integer> s = new Stack<Integer>();   
      s.push(10);
      s.push(20);
      System.out.println(s);
      
      s.pop(); //removes top element
      System.out.println(s);
      
      s.peek();   //displays top element
      System.out.println(s);
    }
}

Output:
[10, 20]
[10]
[10]
