package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class Arraylist1 {

	public static void main(String[] args) {

		ArrayList al =new ArrayList();
		
		ArrayList<String> ar =new ArrayList<String>();
		
		al.add(22);
		al.add("hi");
		al.add(23);
		al.add(24);
		al.add(25);
		al.add(26);
	
		System.out.println(al);
		
		ar.add("aa");
	
		ar.add("ab");
		ar.add("ac");
		ar.add("ad");
		ar.add("ae");
		ar.add("aa");
		
		al.addAll(ar);
		
		System.out.println(al.add(null));
		System.out.println(al);
		
	//	System.out.println(al.lastIndexOf("ag"));
		
		System.out.println("--print all info in arraylist using listiterator cursor---");
		ListIterator litr =al.listIterator();

		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
	
		System.out.println("===========================================================");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			
		}

		System.out.println("===========================================================");

		for(String str:ar) {
			System.out.println(str);
			
		}
		System.out.println("===========================================================");

		for(Object obj :al) {
			System.out.println(obj);
		}
		System.out.println("===========================================================");

		ListIterator<String> st =ar.listIterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		System.out.println("===========================================================");

		Iterator atr =al.iterator();
		while(atr.hasNext()) {
			System.out.println(atr.next());
		}
		
	}

}
