package Arrays;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		
//		int i=10;
//		int j=20;
//		
//		j=40;
//		System.out.println(j);

		//Array Declaration
		
		int arr[] =new int[10];
		
		//Array initialization
		
	
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		arr[5]=60;
		arr[6]=70;
		arr[7]=80;
		arr[8]=90;
		arr[9]=100;
	//	arr[10]=110;
		
		System.out.println(arr[0]);
		System.out.println(arr[7]);
		
		//Length
		
		System.out.println(arr.length);
//		System.out.println("-------------------------------------");
//		arr[1]=390;
//		
//		System.out.println(arr[1]);

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}

		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println();
		
		
	}	
}
