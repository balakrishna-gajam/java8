package collectiontest;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Collections {

	public static void main(String[] args) {
		
		System.out.println("*****STACK ***********");
		Stack<String> stack = new Stack<>();
		
		stack.add("GB Krishna");
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.add("GB Krishna1");
		
		System.out.println("****************");
		//System.out.println("pop--->" + stack.pop());  
		
		System.out.println("peek----> " +stack.peek());
		System.out.println("****************");
		
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println("\t" +itr.next());  
		}  
		
		System.out.println("*****PriorityQueue ***********");
		
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		
		System.out.println("head:" + queue.element()); 
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		
		Iterator itr1 = queue.iterator();
		while (itr1.hasNext()) {
			System.out.println("\t" +itr1.next());
		}
		
	//	queue.remove();
		queue.poll();
		
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
