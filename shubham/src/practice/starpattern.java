package practice;

public class starpattern {

	public static void main(String[] args) {

		for (int i = 1; i <=5; i++) {

			for (int j=1;j<=5;j++) {
				
				System.out.print(" ");
				
				
			//	System.out.print("*");
//				
//				if(i>=2 && j>=2 && i<=4 && j<=4) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
			}
			
			for(int k=1;k<=6-i;k++) {
				System.out.print("*");
			}

			
			
			System.out.println();
		}
	}
}
