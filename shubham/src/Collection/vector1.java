package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1  {

	public static void main(String[] args) {
		
		Vector v =new Vector();
		
		v.add("a");
		v.add(12);
		v.add(22);
		v.add(32);
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v.get(1));
		System.out.println(v.indexOf(32));
		System.out.println(v.lastIndexOf(22));
		System.out.println(v.contains(3));
//		System.out.println(v.set(0, 32));
//		System.out.println(v);
		v.add(1,45);
		System.out.println(v);
		System.out.println("=======================================================================");
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println("=======================================================================");
		ListIterator litr =v.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
			
		}
		System.out.println("=======================================================================");
		for(int i=0;i<=v.size()-1;i++) {
			System.out.println(v.get(i));
			
		}
		System.out.println("=======================================================================");
		for(Object obj :v ) {
			System.out.println(obj);
		}
	
	}
	

}
