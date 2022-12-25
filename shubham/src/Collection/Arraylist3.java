package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist3 {

	public static void main(String[] args) {

		ArrayList al =new ArrayList();
		
		al.add(1);
		al.add("a");
		al.add('b');
		al.add(0.9f);
		al.add(23);
		al.add(true);
		al.add(null);
		al.add(1);
		System.out.println(al);
		
		ArrayList al1 =new ArrayList();
		
		al1.addAll(al);
		System.out.println(al1);
		
		System.out.println(al1.size());
		
		System.out.println(al1.isEmpty());
		
		System.out.println(al1.get(5));
		
		System.out.println(al1.remove(2));
		
		System.out.println(al1.contains(1));
		
		System.out.println(al1.indexOf(true));
		
		System.out.println(al1.lastIndexOf(1));
		
		al.set(3, 23);
		
		System.out.println(al1);
		
		System.out.println();
		
		System.out.println("Using iterator loop :");
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using listiterator loop :");
		
		ListIterator litr =al.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("Using for loop :");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			}
	
		System.out.println("Using for each loop :");
		for(Object obj:al) {
			System.out.println(obj);
		}
	}

}
