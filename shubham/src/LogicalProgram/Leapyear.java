package LogicalProgram;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		System.out.println("Enter a year = ");
		int year1;
		Scanner sc = new Scanner(System.in);
		year1 = sc.nextInt();

		if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0)) {
			System.out.println("Specified year is leap year");
		} else {
			System.out.println("Specified year is not a leap year");
		}

//		int year = 2000;
//
//		if (year % 400 == 0) {
//			System.out.println("leap");
//		} else if (year % 100 == 0) {
//			System.out.println("not leap");
//		} else if (year % 4 == 0) {
//			System.out.println("leap");
//		} else {
//			System.out.println("not leap");
//		}
//
//			if(((year%4 ==0) && (year%100 != 0)) || (year%400 ==0))
//				
//				System.out.println("Leap year");
//			else
//				System.out.println("Not a leap year");

	}

}
