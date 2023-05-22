//Implement Linked List for int values

package list;

public class TesterLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList l1=new SinglyLinkedList();
		l1.insertAtBeg(23); //call to insert function will create 1st node in memory
		l1.insertAtBeg(56);
		l1.insertAtBeg(6);
		l1.insertAtBeg(8);
		l1.insertAtBeg(16);
		l1.insertAtBeg(88);
	
		l1.display();
		
		l1.deleteAtLast();
		l1.display();
		
		l1.search(56);
	}

}
