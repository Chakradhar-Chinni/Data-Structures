import java.util.*;
class linkedlist
{
    public Node head = null;
    public Node tail = null;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void addNewNode(int data)
    {
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
        }
        else{
            tail.next = newnode;
            tail = newnode;
        }
        
    }
    public void display()
    {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args)
    {
        linkedlist list = new linkedlist();
        list.addNewNode(10);
        list.addNewNode(20);
        list.display();
    }
}
