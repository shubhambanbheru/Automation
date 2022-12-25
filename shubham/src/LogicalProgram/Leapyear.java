package LogicalProgram;

public class Leapyear {

	public static void main(String[] args) {

		int year = 2000;

		if (year % 400 == 0) {
			System.out.println("leap");
		} else if (year % 100 == 0) {
			System.out.println("not leap");
		} else if (year % 4 == 0) {
			System.out.println("leap");
		} else {
			System.out.println("not leap");
		}

//			if(((year%4 ==0) && (year%100 == 0)) || (year%400 ==0))
//				
//				System.out.println("Leap year");
//			else
//				System.out.println("Not a leap year");

	}

}
