package dsa.others.others;
import java.util.*;

class AscendingGen<T> implements Comparator<T> {
	public int compare(T a, T b) {
		String a1 = a.toString();
		String b1 = b.toString();
		
		return a1.compareTo(b1);
	}
}

class DescendingGen<T> implements Comparator<T> {
	public int compare(T a, T b) {
		String a1 = a.toString();
		String b1 = b.toString();
		
		return -a1.compareTo(b1);
	}
}

public class Sorting {
	static AscendingGen<String> ascStr = new AscendingGen<>();
	static DescendingGen<String> descStr = new DescendingGen<>();
	
	static AscendingGen<Integer> ascInt = new AscendingGen<>();
	static DescendingGen<Integer> descInt = new DescendingGen<>();
	
	static Scanner scan = new Scanner(System.in);
	
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
			System.out.println(val);
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
			System.out.println(val);
		}
		
	}
}
