package others.others;

public class QueueUsingArray {
	
	private int data[];
	private int front; // index of element at the front of the queue
	private int rear; // index of element at the rear of the queue
	private int size;
	
	
	public  QueueUsingArray() {
		data = new int[5];
		front = -1;
		rear = -1;
	}
	
	public QueueUsingArray(int capacity) {
		data = new int[capacity];
		front = -1;
		rear = -1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	private void doubleCapacity(int[] data) {
		
		int temp[] = data;
		this.data = new int[2*temp.length];
		int index = 0;
		for(int i = front; i < temp.length; i++) {
			this.data[index++] = temp[i];
		}
		for(int i = 0; i < front-1; i++) {
			this.data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length-1;
	}
	
	public void enqueue(int elem) {
		if(size == data.length) {
			doubleCapacity(data);
		}
		if(size == 0) {
			front = 0;
		}
//		rear++;
//		if(rear == data.length) {
//			rear = 0;
//		}
		rear = (rear+1) % data.length;
		
		data[rear] = elem;
		System.out.println(data.length+ " " + data[rear] + " " + elem);
		size++;
	}
	
	public int front() {
		if(size == 0) return 0;
		return data[front];
	}
	
	public int dequeue(){
		if(size == 0) {
			return 0;
		}
		int temp = data[front];
//		front++;
//		if(front == data.length) {
//			front = 0;
//		}
		front = (front+1)%data.length;
		size--;
		if(size == 0) {
			front = -1;
			rear = -1;
		}
//		System.out.println(temp + " ");
		return temp;
	}

}

/*
 * 
f = 2, r = 1

6 7 3 4 5

[3 4 5 ]

6 7 3 4 5  ->8


3 4 5 

reat = (reat+1)%len

index = 0;
2-1= 1
for(i = 0; i < front-1; i++) {

}







 * 
 */
















