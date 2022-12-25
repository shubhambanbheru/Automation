package LogicalProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
//		String str ="12341";
//		String rev ="";
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			rev =rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
//		
//		if(rev.equals(str)) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not a palindrome");
		
//		}
	
	//Factorial of a number -
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter no.");
		int num =scan.nextInt();
		
		
		int fact =1;
		for(int i=1;i<num;i++) {
			fact =fact*i;
			
		}
		System.out.println("factorial of a given no. is :"+fact);
	}
}
