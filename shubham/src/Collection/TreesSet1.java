package Collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreesSet1 {
	
	

	public static void main(String[] args) {

		TreeSet<Integer> tr = new TreeSet<Integer>();
		
		tr.add(10);
		tr.add(20);
		tr.add(30);
		tr.add(40);
		tr.add(50);
		tr.add(60);
		tr.add(70);
		tr.add(80);
		tr.add(90);
		tr.add(100);
		
		System.out.println(tr);
		
		System.out.println(tr.size());
		System.out.println(tr.contains(10));
		System.out.println(tr.first());
		System.out.println(tr.last());
		System.out.println(tr.isEmpty());
		System.out.println(tr.pollFirst());
		System.out.println(tr.pollLast());
		
		tr.add(120);
		tr.add(200);
		System.out.println(tr);
		System.out.println(tr.remove(120));
		
		System.out.println(tr.descendingSet());	
		
		for (Integer i:tr) {
			System.out.println(i);
		}
	}

}
