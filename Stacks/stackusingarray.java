class stackusingarray
{
	int arr[];
	int top,cap;
	public stackusingarray(int c)
	{
		top = -1;
		cap = c;
		arr = new int[cap];

	}
	public int push(int value)
	{
		if(top == cap-1)
		{
			System.out.println("Stack Overflow");
			return -1;
		}
		top++;
		arr[top] = value;
		return 1;
	}
	public int pop()  
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return -1;	
		}
		int element = arr[top]
		top--;
		return element;
	}
	public int size(){ return top++; }
	public int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack Underflow");
			return -1;	 
		}
		return arr[top];
	}
	public static void main(String[] args)
	{
	  stackusingarray obj = new stackusingarray(10);
	  // obj.push(10);
	  // obj.push(20);
	  // obj.push(30);
	  //System.out.println(obj.peek());
	  //System.out.println(obj.size());
	  //System.out.println(obj.pop());
	  //System.out.println(obj.peek());
	}
}
