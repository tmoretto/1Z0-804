package br.com.cert.labs.collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackDequeTest {

	public static void main(String[] args) {
		Deque<String> container = new LinkedList<>();
		container.add("a");
		container.addFirst("b");
		container.add("c");
		container.offer("e");
		container.push("d");
		
		System.out.println(container);
		
		
		Queue<String> container1 = new LinkedList<>();
		container1.add("a");
		container1.add("b");
		container1.offer("c");
		

		System.out.println(container1);
		
		Stack<String> container2 = new Stack<>();
		container2.add("a");
		container2.add("c");
		container2.push("d");
		
		System.out.println(container2);

		
	}

}
