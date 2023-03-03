package dsa.others.SortMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Ascending1 implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return a.compareTo(b);
	}

}

class Descending1 implements Comparator<Integer> {
	public int compare(Integer a, Integer b) {
		return -a.compareTo(b);
	}
}

class A implements Comparable<A>{
	int a;
	int b;
	
	public int compareTo(A x) {
		return this.a - x.a;
	}
}

public class Simple {
	static Ascending1 ascInt = new Ascending1();
	static Descending1 descInt = new Descending1();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<A> arrl = new ArrayList<>();
//		A arr[] = new A[10];
		for(int i = 0;i<10;i++)
		{
			A o = new A();
			o.a = 10-i;
			o.b = 1;
			arrl.add(o);
		}
//		Arrays.sort(arr);
//		
//		Collections.sort(arrl,ascInt);// 
		Collections.sort(arrl);
//		Collections.sort(arrl,descInt);// Collections.sort(arrl, Collections.reverseOrder());
//		
		for(A val : arrl)
		{
			System.out.println(val.a + " " + val.b);
		}
	}
}
