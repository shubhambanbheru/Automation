package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList5 {

	public static void main(String[] args) {

		Object obj[]=new Object[3];
		
		obj[0]=22;
		obj[1]="hi";
		obj[2]=0.9f;
		
		for(Object ob:obj) {
			System.out.println(ob);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(obj));
		System.out.println(al);
		
		Integer i []= {1, 12, 23, 4, 2};
		for(int ar:i) {
			System.out.println(ar);
		}
		ArrayList arr = new ArrayList(Arrays.asList(i));
		System.out.println(arr);
	
		//Collections methods
		Collections.sort(arr);
		System.out.println(arr);
		
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println(arr);
		
		Collections.shuffle(arr);
		System.out.println(arr);
	}

}
