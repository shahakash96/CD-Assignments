package com.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class App {

	public static void main(String arg[]) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Juhi");
		queue.add("Vatsal");
		queue.add("Nehal");

		System.out.println("Head:" + queue.element());
		System.out.println("Head:" + queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//queue.remove();
		//queue.poll();
		
		System.out.println(queue.poll());

		System.out.println("After removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}
