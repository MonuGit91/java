package InterviewQ;

public class Q14_HeapSort {
	public static void swap(int arr[], int i, int j) {
		if(i == j) {
			return;
		}
		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}
	
	public static void heapify(int arr[], int n, int ind) {
		int largest = ind;
		int left = ind * 2 + 1;
		int right = ind * 2 + 2;
		
		if(left < n && arr[largest] < arr[left]) {
			largest = left;
		}
		if(right < n && arr[largest] < arr[right]) {
			largest = right;
		}
		
		if(largest != ind) {
			swap(arr, ind, largest);
			heapify(arr, n, largest);
		}
	}

	public static void heapSort(int arr[]) {
		int n = arr.length;
		
		for(int i = (n/2)-1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		for(int i = n-1; i > 0; i--) {
			swap(arr, 0, i);
			heapify(arr, i, 0);
		}
	}
	
	
	public static void main(String[] args) {
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = 10-i;
		}
		heapSort(arr);
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
