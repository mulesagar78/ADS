//List of int

package list;

public class Node {
	//data members
	private int data;
	private Node next;
	//constructor
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	
	//getter setters
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
