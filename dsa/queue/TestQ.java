package com.queue;
import java.io.BufferedReader;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;

import java.io.InputStreamReader;
import java.io.IOException;

public class TestQ {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static <T> void println(T data) {
		System.out.println(data);
	}
	public static <T> void print(T data) {
        System.out.print(data + " ");
    }
    public static void printStack(Stack<Integer> stk) {
        while(!stk.isEmpty()) {
            print(stk.pop());
        }
    }
    
	public static void main(String[] args) throws IOException {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		Stack<Integer> stk = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i = 10; i > 0; i--) {
			arrList.add(i);
			ll.add(i);
			stk.push(i);
			q.add(i);
			pq.add(i);
		}
		
		println(stk);
		println(q);
		println(arrList);
		println(ll);
		println(pq);
	}
}