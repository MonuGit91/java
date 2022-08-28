package com.others;
import java.util.*;
//class Ascending implements Comparator<Integer> {
//	public int compare(Integer a, Integer b) {
//		return a.compareTo(b);
//	}
//}
//class Descending implements Comparator<Integer> {
//	public int compare(Integer a, Integer b) {
//		return -a.compareTo(b);
//	}
//}
class Ascending<T> implements Comparator<T> {
	public int compare(T a, T b) {
		String a1 = a.toString();
		String b1 = b.toString();
		
		return a1.compareTo(b1);
	}
}
class Descending<T> implements Comparator<T> {
	public int compare(T a, T b) {
		String a1 = a.toString();
		String b1 = b.toString();
		
		return -a1.compareTo(b1);
	}
}

public class Sorting {
	static Ascending<String> ascStr = new Ascending<>();
	static Descending<String> descStr = new Descending<>();
	
	static Ascending<Integer> ascInt = new Ascending<>();
	static Descending<Integer> descInt = new Descending<>();
	
	static Scanner scan = new Scanner(System.in);
	
	public static <T> void print(T val) {
		System.out.print(val + " ");
	}
	
	public static <T> void println(T val) {
		System.out.println(val);
	}
	
	
	//main()
	public static void main(String []arg) {
		
		//sort string ArrayList
		ArrayList<String> arrl = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			arrl.add(scan.nextLine());
		}
		
		Collections.sort(arrl, ascStr);//Collections.sort(arrl);
		Collections.sort(arrl, descStr);//Collections.sort(arrl, Collections.reverseOrder());
		for(String val : arrl) {
			print(val);
		}
//----------------------------------------------------------------
		//sort Integer ArrayList
		ArrayList<Integer> arrl1 = new ArrayList<>();
			
		for(int i = 0; i < 10; i++) {
			arrl1.add(scan.nextInt());
		}
				
		Collections.sort(arrl1, ascInt);//Collections.sort(arrl1);
		Collections.sort(arrl1, descInt);//Collections.sort(arrl1, Collections.reverseOrder());
				
		for(int val : arrl1) {
			print(val);
		}
	}
}
