package LogicalProgram;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no =");   //   10  2,3,4,5,6
		int input =sc.nextInt();
		
		int count=0;
		
		for(int i=2;i<input;i++) {
			if(input%i==0) {
				count=count+1;
			}
		}
		if(count>0) {
			System.out.println("It is not prime....");
		}
		else {
			System.out.println("It is prime....");
		}
	}
}
