package Collection;

import java.util.HashSet;

public class Hashset1 {

	public static void main(String[] args) {

		HashSet<Integer> n = new HashSet<Integer>();
		
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.add(7);
		System.out.println(n);
		
		HashSet<Integer> e = new HashSet<Integer>();
		
		e.add(2);
		e.add(4);
		e.add(6);
		e.add(8);
		e.add(10);
		
	//	hs.addAll(hs1);
	//	System.out.println(hs);
		
		e.addAll(n);
		System.out.println(e);
		
	     e.retainAll(n);
		System.out.println("Common : "+n);
	
		n.clear();
		System.out.println(n);
		
		

	}

}
