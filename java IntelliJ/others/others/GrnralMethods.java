package others.others;

//import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Collections;

public class GrnralMethods {
	public static void main(String[] arg) {
		
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = 10-i;
		}
		
		Arrays.sort(arr);//---------------------->
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		int a = (int)Math.sqrt(16);
		int b = Math.abs(-23);
		
		System.out.println("\n" + a + " " + b);
		
		
	}
}
