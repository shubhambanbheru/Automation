package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist2 {

	public static void main(String[] args) {

		LinkedList ll =new LinkedList();
		
		ll.add("Shubham");
		ll.add("Pratik");
		ll.add("Shubh");
		ll.add("Shubham");
		ll.add("Sagar");
		
//		ll.add(null);
//		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println(ll.size());
		
		System.out.println(ll.get(2));

		System.out.println(ll.indexOf("Shubham"));

		System.out.println(ll.lastIndexOf("Shubham"));
		
		System.out.println(ll.contains(3));
		
		System.out.println(ll.isEmpty());
		
		ll.add("No");
		System.out.println(ll);
		
		ll.set(3,"Bye");
		System.out.println(ll);
		
		Collections.sort(ll);
		
		System.out.println(ll);
		
		Collections.sort(ll,Collections.reverseOrder());
		
		System.out.println(ll);
		
		Collections.shuffle(ll);
		
		System.out.println(ll);
		System.out.println("=========================================");	
		LinkedList ll1 =new LinkedList();
		
		
		ll1.addAll(ll);
		System.out.println(ll1);
		
		ll1.removeAll(ll);
		System.out.println(ll1);
		
		ll.addFirst(10);
		System.out.println(ll);
		
		ll.addLast(100);
		System.out.println(ll);
		
		System.out.println("==============================================================");
		ListIterator litr =ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("==============================================================");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============================================================");
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("==============================================================");
		for(Object obj:ll) {
			System.out.println(obj);
		}


	}

}
