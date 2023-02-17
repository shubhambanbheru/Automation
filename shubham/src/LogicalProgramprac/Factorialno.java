package LogicalProgramprac;

import java.util.Scanner;

public class Factorialno {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input value = ");
		
		int input =sc.nextInt();
		
		int fact =1;
		//10! =9*7*6*5*4*3*2*1 
		
		for(int i=1;i<input;i++) {
			fact =fact*i;
		}
		System.out.println(fact);

	}
}
