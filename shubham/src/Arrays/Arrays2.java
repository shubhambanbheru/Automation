package Arrays;

import java.util.Arrays;

public class Arrays2 {

	public static void main(String[] args) {
		
		char c[] =new char[4];
		
		c[0]='L';
		c[1]='A';
		c[2]='C';
		c[3]='M';
		
	

		Arrays.sort(c);
		

		//System.out.println(c[1]);
	
		for (int i=0;i<4;i++) {
			System.out.println(c[i]);
			
			
		}
	
		
	}
}
