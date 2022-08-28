package com.others;
import java.util.*;

public class UserMainCode {
	public static Scanner scan = new Scanner(System.in);
	
	public static List<Integer> applyOperations(List<Integer> arr) {
		
		Stack<Integer> stk = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 0; i < arr.size(); i++) {
			while(!stk.isEmpty()) {
				q.add(stk.pop());
			}
			
			stk.push(arr.get(i));
			
			while(!q.isEmpty()) {
				stk.push(q.poll());
			}
		}
		
		List<Integer> list = new ArrayList<Integer>();
		while(!stk.isEmpty()) {
			list.add(stk.pop());
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scan.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		
		List<Integer> l = applyOperations(arr);
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
	}

}
