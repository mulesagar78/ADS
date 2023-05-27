import java.util.*;
class singlylist
{
	static class node
	{
		private int data;
		private node next;
		
		public node()
		{
			data=0;
			next=null;
		}
		public node(int val)
		{
			data=val;
			next=null;
		}
	}
	private node head;
	
	public singlylist()
	{
		head=null;
	}
	void display()
	{
		System.out.println("list:");
		node trav=head;
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println();
	}
	void addlast(int val)
	{
		node newnode=new node(val);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			node trav=head;
			while(trav.next!=null)
			{
				System.out.println(trav.data);
				trav=trav.next;
//				trav.next=newnode;
			}
			trav.next=newnode;
		}
		
	}
	void addfirst(int val)
	{
		node newnode=new node(val);
		newnode.next=head;
		head=newnode;
	}
	void addpos(int val,int pos)
	{
		node newnode=new node(val);
		node trav=head;
		for(int i=1;i<pos-1;i++)
		{
			trav=trav.next;
			
		}
		newnode.next=trav.next;
		trav.next=newnode;
	}
	void deletfirst()
	{
		if(head==null) {
			System.out.println("list is empty");
			return;			
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		head=head.next;
	}
	void deletlast()
	{
		node temp=null,trav=head;
		while(trav.next!=null)
		{
			temp=trav;
			trav=trav.next;
		}
		temp.next=null;
	}
	void deletall()
	{
		head=null;
	}
	void deletpos(int pos) {
		if(pos==1)
		{
			deletfirst();
			return;
		}
		node temp=null,trav=head;
		
		for(int i=1;i<pos;i++)
		{
			temp=trav;
			trav=trav.next;
		}
       	temp.next=trav.next;
	}
	

}


public class singlylistmain {

	public static void main(String[] args) {
		int choice,pos,val;
		singlylist list=new singlylist();
		Scanner sc =new Scanner(System.in);
		do
		{
			System.out.println("\n0. Exit \n1 .Display\n2. Addfirst\n3. Addlast\n4.Add at pos\n5. Deletefirst\n6. Deletelast\n7. Deleteall\n8. Delet at pos/n9");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1://display
			       list.display();
			       break;
			       
			case 2://addfirst
				System.out.println("enter the element");
				val=sc.nextInt();
				list.addfirst(val);
				break;
			
			case 3://addlast
				System.out.println("enter the element");
				val=sc.nextInt();
				list.addlast(val);
				break;
			case 4://ad at pos
				
			       System.out.println("enetr element");
			       val=sc.nextInt();
			       System.out.println("enter at pos");
			       pos=sc.nextInt();
			       list.addpos(val, pos);
			       
			case 5://deleteatfirst
					list.deletfirst();
				break;
			case 6://deletelast
				System.out.println("delete last");
				list.deletlast();
			       
			case 7://deletall
				
			       list.deletall();
			case 8 ://delet at pos
				
				
				System.out.println("enetr pos");
				pos=sc.nextInt();
				list.deletpos( pos);
			       break;
			}
		}while(choice!=0);
		sc.close();
		

	}

}
