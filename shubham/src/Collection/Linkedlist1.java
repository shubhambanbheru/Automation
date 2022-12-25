package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlist1 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		
		ll.add(12);
		ll.add("hi");
		ll.add(12);
		ll.add(null);
		System.out.println(ll);
	
		System.out.println(ll.size());
		
	//	System.out.println(ll.remove(1));
		System.out.println(ll);
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.contains("hi"));
		
		System.out.println(ll.indexOf(1));
		
		System.out.println(ll.lastIndexOf(12));
		
		System.out.println(ll.lastIndexOf("B"));
		
	//	ll.set(1, 34);
		System.out.println(ll);
		
		System.out.println(ll.get(3));
		
	//	ll.add(4,90);
		
	//	1.
		
		Iterator itr =ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	//	2.
		ListIterator litr =ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}

	//	3.
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	//	4.
		for(Object obj:ll) {
			System.out.println(obj);
		}
	
	
	
	
	}

}
