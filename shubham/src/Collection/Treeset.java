package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet tr =new TreeSet();
		
		tr.add(10);
		tr.add(20);
		tr.add(30);
		tr.add(50);
		tr.add(40);
		tr.add(60);
		tr.add(70);
		
		System.out.println(tr);
		
		//descending order
		
		Iterator itr =tr.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}

	}
}
