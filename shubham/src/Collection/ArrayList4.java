package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {

	public static void main(String[] args) {

		ArrayList ar =new ArrayList();
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		System.out.println(ar);
		ArrayList Duplicate =new ArrayList();
		
		Duplicate.addAll(ar);
		System.out.println(Duplicate);
	
		Duplicate.removeAll(ar);
		System.out.println("After removing :"+ Duplicate);
		
		//Collections method
		
		Collections.sort(ar);
		System.out.println("After sorting :"+ ar);
		
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println("After reverse order :"+ ar);
		
		Collections.shuffle(ar);
		System.out.println("After shuffle :"+ ar);
	
	
	}

}
