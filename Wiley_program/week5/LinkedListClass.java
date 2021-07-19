package week5;

class LinkedList
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			this.data=d;
			this.next=null;
		}
	}
	void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
	}
	void insert(int num)
	{
		Node temp=new Node(num);
		Node curr=head;
		if(head==null)
		{
			head=temp;
			return;
		}
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		//append element at last
		curr.next=temp;
	}
	void delete(int num)
	{
		Node curr=head;
		Node prev=null;
		if(curr!=null && curr.data==num)
		{
			head=curr.next;
			return;
		}
		while(curr!=null && curr.data!=num)
		{
			prev=curr;
			curr=curr.next;
		}
		if(curr!=null)
		{
			prev.next=curr.next;
			System.out.println(num+" deleted");
		}
		if(curr==null)
		{
			System.out.println(num+ " not found");
		}
	}
}

public class LinkedListClass {
	public static void main(String []args)
	{
		LinkedList ll=new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.display();
		ll.delete(4);
		ll.display();
	}
}
