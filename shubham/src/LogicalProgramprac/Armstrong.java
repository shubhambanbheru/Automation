package LogicalProgramprac;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the input");
		int input =sc.nextInt();
		int sum =0;
		
		for(int i=input;i>0;i=i/10) {
			
		int	rem =i%10;
		
		sum =sum+(rem*rem*rem);
		}

		if (sum==input) {
			System.out.println("The no. is Armstrong no.");
			
		}
		else {
			System.out.println("The no. is not an Armstrong no.");
		}
	}
	

}
