package week5;
class Queue{
	int front,rear,size;
	int queArr[];
	Queue(int size)
	{
		this.size=size;
		front=0;
		rear=0;
		queArr=new int[size];
	}
	void enqueue(int num)
	{
		//enqueue is adding element at rear
		if(rear==size)
		{
			System.out.println("Queue is full, cannot perform enqueue");
			return;
		}
		queArr[rear]=num;
		rear++;
	}
	void dequeue()
	{
		//dequeue removing element from front
		if(front==rear)
		{
			System.out.println("Queue is empty cannot perform dequeue");
			return;
		}
		for(int i=front;i<rear-1;i++)
		{
			queArr[i]=queArr[i+1];
		}
		queArr[rear]=-1;//indication that number is removed
		rear--;//rear is decremented
	}
	void peek()
	{
		if(front==rear)
		{
			System.out.println("queue is empty");
			return;
		}
		System.out.println(queArr[front]);
	}
	void displayQueue()
	{
		if(front==rear)
		{
			System.out.println("Queue is empty");
			return;
		}
		for(int i=front;i<rear;i++)
		{
			System.out.print(queArr[i]+"->");
		}
		System.out.println();
	}
}
public class QueueClass{
	public static void main(String []args)
	{
		Queue qu=new Queue(6);
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		qu.enqueue(4);
		qu.enqueue(5);
		qu.displayQueue();
		qu.peek();
		qu.dequeue();
		qu.peek();
		qu.displayQueue();
	}
}

