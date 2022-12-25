package Arrays;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {

		double d[]=new double[5];
		
		d[0]=2;
		d[1]=5;
		d[3]=4;
		d[2]=5.55;
		d[4]=45.32;
		
	
		Arrays.sort(d);
		
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}

		
	}

}
