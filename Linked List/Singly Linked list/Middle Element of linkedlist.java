class linkedlistq1
{
	static int length = 0;
	public Node head = null;
	public Node tail = null;
	public Node temp = null;
	public Node current = null;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			this.next = null;
			length++;
		}
	}
	public void add(int data)
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
// 	public void display()
// 	{
// 		if(head==null)
// 		{
// 			System.out.println("Linked List is empty");
// 			return;
// 		}
// 		current = head;
// 		while(current!=null)
// 		{
// 			System.out.print(current.data+" ");
// 			current = current.next;
// 		}
// 	}
	public void viewelement(int index)
	{
		current = head;
		for(int i=0;i<index;i++)
		{
			current = current.next;
		}
		System.out.println("Middle Element is: "+current.data);
	}
	public static void main(String[] args)
	{
		linkedlistq1 list = new linkedlistq1();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		//list.display();
		list.viewelement(length/2);
		System.out.println("Length is: "+length);
	}
}
