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

//search()
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
      Stack<Integer> s = new Stack<Integer>();   
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(50);
      s.push(60);
      s.push(70);
      System.out.println(s);
      
      System.out.println("Search Method");
      System.out.println(s.search(70));
      System.out.println(s.search(30));
      
      //to get actual position see the below code - useful for coding
      System.out.println("Acutal Index method");
      System.out.println(s.size()-s.search(70));
      System.out.println(s.size()-s.search(30));
    }
}

/*
searches the element from top of stack using 1-based index and returns first occurence
returns -1 if element is not found

*/
Output:
[10, 20, 30, 40, 50, 60, 70]
Search Method
1
5
Acutal Index method
6
2

//empty()
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
      Stack<Integer> s = new Stack<Integer>();   
      
      boolean r = s.empty(); // returns true as present state of stack is empty
      System.out.println(r); 
      
      s.push(10);
      s.push(70);
      
       r = s.empty(); // returns false of stack is not empty
      System.out.println(r); 
      
    }
}

Output:
true
false
