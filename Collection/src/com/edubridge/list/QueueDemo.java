package com.edubridge.list;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer>q1=new PriorityQueue<>();
		q1.add(15);
		q1.add(7);
		q1.add(9);
		q1.add(41);
		System.out.println(q1);
		for(int i:q1)
		{
			System.out.print(i+" ");
		}
		Deque<Integer>d=new LinkedList<>();
		d.add(15);
		d.add(7);
		d.add(9);
		d.add(41);
		System.out.println(d);
		d.addFirst(1);
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		/*d.pollLast();
		d.pollLast();
	 	d.pollLast();
		d.pollLast();
	 	d.pollLast();*/
		
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		d.removeLast();
		System.out.println(d);
	}

}
