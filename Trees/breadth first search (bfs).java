import java.util.*;
class Node
{
    int key;
	Node left;
	Node right;
	Node(int k)
	{
	  key=k;
	  left = right = null;
	}
}
class BFS
{
	public static void BFS(Node root)
	{
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		//System.out.println(curr+" ");
		while(q.isEmpty()==false) //!q.isEmpty()
		{
			Node curr = q.poll();
			System.out.print(curr.key+" ");
			if(curr.left != null)
				q.add(curr.left);
			if(curr.right != null)
				q.add(curr.right);
		}
	}
	public static void main(String[] args)
	{
		Node root = new Node(10);
		root.left = new Node(15);
		root.right = new Node(20);
		root.left.left = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.left = new Node(60);
		root.right.right.right = new Node(70);

		BFS(root);
	}
}

/*
By mixing :
	height of tree O(n)
	printkdist 		O(n)
	we can perform BFS, but this is not efficient
*/

/* Effecient
Linear Time: O(n)
By using queue DS

*/
