import java.util.*;
class codechef
{
    public static int min=0;
    Stack<Integer> s = new Stack<>();
    void push(int data)
    {
        if(s.isEmpty()){
            min = data;
        }
        else{
            if(data<min)
                min = data;
        }
        s.push(data);
    }
    void pop()
    {
        if(s.isEmpty())
            return;
        else
            s.pop();
    }
    void minele()
    {
        System.out.println(min);
    }
    public static void main(String[] args)
    {
        codechef cc = new codechef();
        cc.push(10);
        cc.push(20);
        cc.push(9);
        cc.push(30);
        cc.minele();
    }
}
