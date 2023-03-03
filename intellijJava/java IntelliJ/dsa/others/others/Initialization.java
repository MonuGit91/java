package dsa.others.others;

import java.util.*;

public class Initialization {
    
	public static void main(String [] arg) {
		List<Integer> arrl = new ArrayList<>();//ArrayList<Integer> arrl1 = new ArrayList<Integer>();
		Stack<Integer> stk = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> pq = new PriorityQueue<>();//PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		Set<Integer> hsSt = new HashSet<>();//HashSet<Integer> hsSt1 = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<>();//HashMap<Integer, Integer> map1 = new HashMap<>();
		
		for(int i = 0; i < 10; i++) {
			arrl.add(i);
			stk.push(i);//stk.add(i);
			q.add(i);
			pq.add(i);
			hsSt.add(i);
			map.put(i, i+100);
		}
		
		
		for(int i : arrl) {
			System.out.print(i + " ");
		}
		println();
		
		for(int i : stk) {
			System.out.print(i + " ");
		}
		println();
		
		for(int i : q) {
			System.out.print(i + " ");
		}
		println();
		
		for(int i : pq) {
			System.out.print(i + " ");
		}
		println();
		
		for(int i : hsSt) {
			System.out.print(i + " ");
		}
		println();
		
		for(Map.Entry<Integer, Integer> entity : map.entrySet()) {
			int key = entity.getKey();
			int val = entity.getValue();
			
			System.out.print(key + " " + val + ", ");
		}
	}

	private static void println() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}
}
