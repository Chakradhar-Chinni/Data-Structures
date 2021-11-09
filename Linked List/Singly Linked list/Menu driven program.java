import java.util.Scanner;
class SinglyLinkedList
{
	public Node head = null;
	public Node tail = null;
	class Node
	{
		int data;
		Node next;	
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void addnewNode(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("LinkedList is empty");
			return;
		}
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	public void AddAtFront(int data)
	{
		Node newNode = new Node(data);
		if(head==null)
		{
			head = newNode;
		}
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	public void AddAtIndex(int index,int data)
	{
		Node newNode = new Node(data);
		Node temp;
		temp = head;
		for(int i=0;i<index-1;i++)
		{
			temp = temp.next;
		}
		newNode.next = temp.next.next;
		temp.next = newNode;
	}
	public void DeleteLastNode()
	{
		Node temp = head;
		Node t = null;
		while(temp.next!=null)
		{
			t = temp;
			temp = temp.next;
		}
		t.next = null;             
	}
	public void DeleteFirstNode()
	{
		Node current = head;
		head = current.next;
	}
	public void DeleteAtIndex(int index)
	{
		if(head==null)
		{
			System.out.println("Linked List is empty");
			return;
		}
		Node temp=head;
		Node current=head;
		for(int i=0;i<index;i++)
		{
			temp = current.next;
			current = temp;
		}
		current.next = temp.next;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		SinglyLinkedList list = new SinglyLinkedList();
		boolean flag = true;
		int data,index;
		
		while(flag)
		{
			System.out.println("==========");
			System.out.println("1. Add New Node");
			System.out.println("2. Display");
			System.out.println("3. Add Node at front");
			System.out.println("4. Add Node at Specific index");
			System.out.println("5. Delete Last Node");
			System.out.println("6. Delete First Node");
			System.out.println("7. Delete at Specific Index");

			System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1: System.out.println("Enter node data");
							data = sc.nextInt();
							list.addnewNode(data);
					 		break;
					case 2:  list.display();
							 break;
					case 3: System.out.println("Enter node value");
							data = sc.nextInt();
							list.AddAtFront(data);
							break;
					case 4: System.out.println("Enter node value");
							data = sc.nextInt();
							System.out.println("Enter index position");
							index = sc.nextInt();
							list.AddAtIndex(index,data);
							break;
					case 5: list.DeleteLastNode();
							break;
					case 6: list.DeleteFirstNode();
							break;
					case 7: System.out.println("Enter index to delete");
							index = sc.nextInt();
							list.DeleteAtIndex(index);
							break;
					case 0: flag=false;
							break;
					default: System.out.println("Incorrect Choice");
				}
		}	
	}
}
/*
class SinglyLinkedList
{
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
		  this.data = data;
		  this.next = null;
		}
	}
		public Node head = null;
		public Node tail = null;

		public void addNode(int data)
		{
			Node newNode = new Node(data);

			if(head==null)
			{
			   head = newNode;
			   tail = newNode;
			}
			else
			{
			   tail.next = newNode;
			   tail = newNode;
			}
		}
		public void display()
		{
			Node current = head;
			if(head == null)
			{
				System.out.println("List is empty");
				return;
			}
			System.out.println("Linked List Nodes are:\n");
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current = current.next;
			}
	    }
	
	public static void main(String[] args)
	{
		SinglyLinkedList list = new SinglyLinkedList();

		list.addNode(10);
		list.addNode(20);
		list.addNode(10);
		list.addNode(20);
		list.display();
	}
}
*/
