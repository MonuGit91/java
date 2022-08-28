package com.others;

import java.util.*;

public class Initialization {
    
	public static void main(String [] arg) {
		ArrayList<Integer> arrl = new ArrayList<Integer>();
		Stack<Integer> stk = new Stack<Integer>();
		Queue<Integer> q = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		HashSet<Integer> hsSt = new HashSet<Integer>();
		Map<Integer, Integer> map = new HashMap<>();
		
		arrl.add(1);
		Iterator<Integer> it = arrl.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hsSt.add(123);
		it = hsSt.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		map.put(100, 200);
		for(Integer i : map.keySet()) {
			System.out.println(i + " " + map.get(i));
		}
	}
}
