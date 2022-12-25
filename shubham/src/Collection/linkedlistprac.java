package Collection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlistprac {
	
	public static void main(String[] args) {
		
		LinkedList ll =new LinkedList();
		
		ll.add(20);
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add("id");
		ll.add("id");
		
		// Q.//given scenario- you hav a big data and select only 
		//unique info
		//so what is your approach?---->use HashSet()
		
		HashSet hs =new HashSet(ll);
		System.out.println(hs);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//listiterator
//		ListIterator litr = ll.listIterator();
//		while(litr.hasNext()){
//			System.out.println(litr.next());
//			
//		}
//		//iterator
//		Iterator itr =ll.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		//for each 
//		for(Object obj:ll) {
//			System.out.println(obj);
//		}
//		//for loop
//		for(int i=0;i<ll.size();i++) {
//			System.out.println(ll.get(i));
//		}
//			
	}

}
