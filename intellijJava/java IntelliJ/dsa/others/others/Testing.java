package dsa.others.others;

public class  Testing{
	int i = 0;
	int arr[] = new int[5];
	
	private void put(int a) {
		arr[i++] = a;
	}
	public void fill(int a) {
		put(a);
	}
	public void print() {
		for(int val : arr) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
		System.out.println("hii!");
	}
}
