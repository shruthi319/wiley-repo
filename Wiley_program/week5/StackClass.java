package week5;
import java.util.Scanner;

class Stack {
	int num=15;
	int top;
	int arr[]=new int[num];
	Stack()
	{
		top=-1;
	}
	boolean push(int n)
	{
		if(top>=arr.length-1)
		{
			System.out.println("stack is full, cannot push");
			return false;
		}
		else
		{
			arr[++top]=n;
			return true;
		}
	}
	int pop()
	{
		if(top<0)
		{
			System.out.println("stack is empty,cannot pop");
			return -1;
		}
		return arr[top--];
	}
	int peek()
	{
		if(top<0)
		{
			System.out.println("Stack is empty, cannot do peek operation");
			return -1;
		}
		return arr[top];
	}
}
public class StackClass{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		Stack s=new Stack();
		boolean isPushed;
		int poped,peeked;
		int choice;
		int n;
		while(true)
		{	
			System.out.println("enter a choice 1.Push 2.Pop 3.Peek 4.exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("enter an element to push into the stack");
					n=sc.nextInt();
					isPushed=s.push(n);
					if(isPushed)
					{
						System.out.println("element "+n+" pushed into stack");
					}
					break;
			case 2: System.out.println("performing pop operation");
					poped=s.pop();
					if(poped!=-1)
					{
						System.out.println(poped+" element is poped from stack");
					}
					break;
			case 3:System.out.println("displaying the top element");
					peeked=s.peek();
					if(peeked!=-1)
					{
						System.out.println(peeked+" is the top element");
					}
					break;
			case 4:System.out.println("exiting");
					return;
			default:System.out.println("enter proper choice");
			        break;
			}
		}
		
	}
}
