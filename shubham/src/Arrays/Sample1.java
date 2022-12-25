package Arrays;

import java.util.Arrays;

public class Sample1 {

	public static void main(String[] args) {

		int sum =0;
		int a[][]= new int[3][2];
		
		a[0][0]=10;					
		a[0][1]=20;
		a[1][0]=90;
		a[1][1]=70;
		a[2][0]=80;
		a[2][1]=60;
	
//			0	1
//		0	10	20
//		1	30	40	
//		2	50	60
	
		System.out.println(a[0][1]);
//	Arrays.sort(a);
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
				sum =sum+a[i][j];
				
				System.out.print(a[i][j]+" ");
				
			}
		}
	

	System.out.println("sum="+" "+ sum);
	
	
	}

}
