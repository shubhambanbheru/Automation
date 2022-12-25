package Arrays;

import java.util.Arrays;

public class Arrays4 {

	public static void main(String[] args) {
		
		String s[]=new String[3];
		
		s[0]="aaa";
		s[1]="aab";
		//s[2]=null;          //When we sort arrays,null can't be sort it gives error
							// java.lang.NullPointerException
							
		
		Arrays.sort(s);
		
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
	}
}
