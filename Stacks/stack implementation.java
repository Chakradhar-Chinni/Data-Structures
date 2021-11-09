import java.util.*;
class codechef
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);           // [10, 20, 30]
        System.out.println(s.peek());     // 30
    }
}
