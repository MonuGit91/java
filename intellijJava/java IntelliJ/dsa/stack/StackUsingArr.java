package dsa.stack;

public class StackUsingArr {
	private int arr[];
	private int capacity;
	private int topIndex;
	
	public StackUsingArr() {
		arr = new int[10];
		topIndex = -1;
		capacity = 10;
	}
	
	private int[] increaseArr() {
		capacity *= 2;
		int[] newArr = new int[capacity];
		
		int i = 0;
		for(int val : arr) {
			newArr[i++] = val;
		}
		
		return newArr;
	}
	
	public void push(int data) throws StackFullException {

		if(topIndex >= capacity-1) {
			throw new StackFullException();
		}
		arr[topIndex+1] = data;
		topIndex++;
		
//		if(topIndex == capacity) {
//			arr = increaseArr();
//		}
		
	}
	
	public int pop() throws EmptyStackException {
		if(topIndex == -1) {
			throw new EmptyStackException();
		}
		topIndex--;
		return arr[topIndex+1];
	}
	
	public int top() throws EmptyStackException {
		if(topIndex == -1) {
			throw new EmptyStackException();
		}
		return arr[topIndex-1];
	}
	
	public int size() {
		return topIndex+1;
	}
	
	public boolean isEmpty() {
		return topIndex == 0;
	}
}
