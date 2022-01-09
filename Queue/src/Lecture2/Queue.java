package Lecture2;

public class Queue {
	private int maxSize;//size of queue array
	private int front;//front of the queue
	private int []queArray;
	private int rear;//rear of the queue
	private int nItems;//no of item of the queue

	public Queue(int j) {
		maxSize = j;
		queArray = new int [maxSize];
		front = 0;
		rear = -1;
		nItems= 0;
	}
	
	public void insert(int j) {
		//check whether queue is full
		if(rear==maxSize -1)
			System.out.println("Queue is full");
		else {
			queArray[++rear]=j;
			nItems++;
		}
	}


//Remove
public int remove()
{
		if(nItems==0)
		{
			System.out.println("Queue is empty");
			return -99;
		}
		else
		{
			nItems--;
			return queArray[front++];
		}
	}


//Peekfront
public int peekFront()
{
	if(nItems==0)
	{
		System.out.println("Queue is emplty");
		return -99;
	}
	else
		
		return queArray[front];
	}
}

