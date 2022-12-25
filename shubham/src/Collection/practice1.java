package Collection;

import java.util.Collections;
import java.util.LinkedList;

public class practice1 {

	public static void main(String[] args) {

LinkedList ll =new LinkedList();
		
		ll.add("Shubham");
		ll.add("Pratik");
		ll.add("Shubh");
		ll.add("Shubham");
		ll.add("Sagar");
	//	ll.add(null);
	//	ll.add(null);
		
		System.out.println(ll);
		System.out.println("=========================================");
		Collections.sort(ll);
		System.out.println(ll);
		System.out.println("=========================================");
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll);
		System.out.println("=========================================");
		Collections.shuffle(ll);
		System.out.println(ll);
		
		
		
	}
	
	
	

}
