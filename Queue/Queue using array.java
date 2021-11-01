import java.util.*;
class Queue
{
	int array[];
	int capacity,front,rear,size;
	Queue(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	void enqueue(int item)
	{
		if(isFull(this))
			return;
		this.rear = (this.rear+1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size+1;
		System.out.println(item +" inserted");
	}
	int dequeue()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		int item = array[this.front];
		this.front = (this.front+1) % this.capacity;
		this.size = this.size-1;
		return item;
	}
	boolean isEmpty(Queue queue)
	{
		return (queue.size==0);
	}
	boolean isFull(Queue queue)
	{
		return (queue.size==queue.capacity);
	}
	int front()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}
	int rear()
	{
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array[this.rear];
	}
	public static void main(String[] args)
	{
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		System.out.println(queue.front());
		queue.dequeue();
		queue.enqueue(20);
		 System.out.println(queue.front());
		 System.out.println(queue.rear());
	}
}
// /*
// isEmpty(this) -> Current class object is passed
// */
