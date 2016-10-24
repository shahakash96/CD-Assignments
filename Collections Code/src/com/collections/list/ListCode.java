package com.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCode {

	public static void main(String arg[]) {

		List<String> list1 = new ArrayList<>();

		list1.add("Banana");
		list1.add("Mango");
		list1.add("Apple");

		// Iterate through list
		for (String list : list1) {
			System.out.println(list);
		}

		// Difference between ArrayList and LinkedList

		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		addItems("ArrayList", arrayList);
		addItems("LinkedList", linkedList);

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
		searchItmes("ArrayList", arrayList);
		searchItmes("LinkedList", linkedList);

		removeItems("ArrayList", arrayList);
		removeItems("LinkedList", linkedList);
	}

	private static void addItems(String type, List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();	
		System.out.println("Adding Items");
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

	private static void doTimings(String type, List<Integer> list) {

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();		
		System.out.println("Replacing Items");
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}

	private static void removeItems(String type, List<Integer> list) {
		
		//LinkeList is better while removing the first element
		/*long start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.remove(list.size()-1);
		}

		long end = System.currentTimeMillis();		
		System.out.println("Removing Items");
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
		*/
		
		//ArrayList is better while removing the last element
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1E5; i++) {
			list.remove(list.size()-1);
		}

		long end = System.currentTimeMillis();		
		System.out.println("Removing Items");
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
	
	private static void searchItmes(String type, List<Integer> list) {
		
		long start = System.currentTimeMillis();

		for(int i = 0; i < 1E5; i++){
			list.get(i);
		}
		
		long end = System.currentTimeMillis();	
		
		System.out.println("Searching Items");
		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}