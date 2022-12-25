package Collection;

import java.util.PriorityQueue;

public class Priorityqueue1 {

	public static void main(String[] args) {

		PriorityQueue p =new PriorityQueue();
		PriorityQueue p1 =new PriorityQueue();
		
		
		p.add("a");
		p.add("12");
		p.add("b");
		System.out.println(p);
		
		p.offer("d");
		p.offer("2");
		p.offer("c");
		p.offer("a");
		System.out.println(p);
		
		// TO PRINT HEAD ELEMENT 
		
		System.out.println(p.element());
	//	System.out.println(p1.element());
		
		System.out.println(p1.peek());
		
		// TO REMOVE HEAD ELEMENT 
		
		System.out.println(p.remove());
	//	System.out.println(p1.remove());
		System.out.println(p.poll());
		System.out.println(p1.poll());
		
		for (Object obj :p) {
			System.out.print(" "+obj);
		}
		
	}

}
