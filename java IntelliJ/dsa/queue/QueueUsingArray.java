package dsa.queue;

public class QueueUsingArray {
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void enQueue(int data) throws FullQueueException {
		if(size == this.data.length) {
//			throw new FullQueueException();
			int [] newData = new int[size*2];
			
			int i = front;
			int j = 0;
			while(i != rear) {
				newData[j++] = this.data[i];
				i = ((i+1) % this.data.length);
			}
			
			newData[j] = this.data[i];
			
			this.data = newData;
			rear = j;
			front = 0;
		}
		
		if(size == 0) {
			front++;
		}
		
//		rear++;
//		
//		if(rear == this.data.length) {
//			rear = 0;
//		}
		
		rear = (rear+1) % this.data.length;
		
		this.data[rear] = data;
		size++;
	}
	
	public int deQueue() throws EmptyQueueException {
		if(size == 0) {
			throw new EmptyQueueException();
		}
		
//		front++;
//		
//		if(front == this.data.length) {
//			front = 0;
//		}
		int temp = data[front];
		front = (front+1) % this.data.length;
		
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
		return temp;
	}
	public int front() throws EmptyQueueException {
		if(size == 0) {
			throw new EmptyQueueException();
		}
		
		return data[front];
	}
}
