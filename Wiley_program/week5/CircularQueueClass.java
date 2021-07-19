package week5;

class CircularQueue{
	int front,rear,size;
	int cqueArr[];
	CircularQueue(int size)
	{
		this.size=size;
		this.front=this.rear=-1;
		cqueArr=new int[size];
	}
	void enqueue(int num)
	{
		//if the queue is full
		if((rear==size-1 && front==0 )||  (rear == (front - 1) % (size - 1)))
		{
			System.out.println("queue is full, cannot perform enqueue");
			return;
		}
		//queue is empty , adding first element
		if(front==-1)
		{
			front=0;
			rear=0;
			cqueArr[rear]=num;
		}
		else if(rear==size-1 && front!=0)
		{
			rear=0;
			cqueArr[rear]=num;
		}
		else {
			rear=rear+1;
			cqueArr[rear]=num;
		}
	}
	int dequeue()
	{
		if(front==-1)
		{
			System.out.println("queue is empty, cannot dequeue");
			return -1;
		}	
		int ret=cqueArr[front];
		//System.out.println(ret);
		if(front==rear)//queue has only one element
		{	
			front=-1;
			rear=-1;
		} 
		else if(front==size-1)
		{
			front=0;
		}
		else {
			front=front+1;
		}
		return ret;
	}
		
	
	void display()
	{
		if(front==-1)
		{
			System.out.println("circular queue is empty");
		}
		if(rear>=front)
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.print(cqueArr[i]+"->");
			}
		}
		else
		{
			for(int i=front;i<size;i++)
			{
				System.out.print(cqueArr[i]+"->");
			}
			for(int i=0;i<rear;i++)
			{
				System.out.println(cqueArr[i]+"->");
			}
			System.out.println();
		}
	}
}
public class CircularQueueClass {
	public static void main(String[] args)
	{
		CircularQueue cq=new CircularQueue(7);
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		cq.enqueue(6);
		cq.enqueue(7);
		
		cq.display();
		int ans=cq.dequeue();
		System.out.println();
		System.out.println(ans+" removed");
		cq.display();
		ans=cq.dequeue();
		System.out.println();
		System.out.println(ans+" removed");
		cq.display();
		cq.enqueue(8);
		cq.display();
		
	}
}
