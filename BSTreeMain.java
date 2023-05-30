package bstree;

class BinarySearchTree
{
	static class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node()
		{
			data=0;
			left=null;
			right=null;
		}
		public Node(int val)
		{
			data = val;
			left = null;
			right = null;
		}
	}
	private Node root;
	public BinarySearchTree()
	{
		root=null;
	}
	public void add(int val)
	{
	   Node	NewNode=new Node(val);
	   if(root==null)
		   root=NewNode;
	   else
	   {
		   Node trav=root;
		   while(true)
		   {
			   if(val<trav.data){
				   if(trav.left!=null)
					   trav=trav.left;
				   else {trav.left=NewNode;
				   break;
				   }
				   }
			   
				   else{
				   if(trav.right!=null)
					   trav=trav.right;
				   else
				   {
					   trav.right=NewNode;
					   break;
				   }
			   }
		   }
	   }
	   
	}
	public  void preorder(Node trav)
	{
		if(trav==null)
			return;
		System.out.print(trav.data +" ");
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder()
	{
		System.out.print("PRE : ");
		preorder(root);
	}
}

public class BSTreeMain {

	public static void main(String[] args)
	{
		BinarySearchTree t=new BinarySearchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		//t.display();
		t.preorder();

	}

}
