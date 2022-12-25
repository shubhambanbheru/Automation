package LogicalProgram;

	import java.util.Scanner;

	public class ArmstrongNumber {

		public static void main(String[] args) {

			//153   -- 1^3 =1
			           //5^3 =125 + 3^3 = 27   +1 = 153
			
			//120 = 1+8+0 = 9
			
			int sum ,P ,rem;
			System.out.println("Enter a number");
			
			Scanner Sc =new Scanner(System.in);
			
			int num =Sc.nextInt();          //    = 153
			
			P = num;
			           // 153>0 - true  
			           //15>0  - true
			           //1>0  - true
			           //0>0   - false
			for(sum=0 ; num>0 ; num=num/10) {	    // 153 = 153/10 =15	  15= 15/10 -->1
				
				rem =num%10 ;  //153%10= 3   15%10 =5  1%10 = 1   1/10 = 0
				
				sum = sum+rem*rem*rem;
			//	27   = 0+3*3*3 = 27
			//	152 = 27 +5*5*5  = 125+27 =152
		    // 152=152 +1*1*1 = 152+1  = 153
				
			}
			 // 153 == 153 
			if(sum==P)
				System.out.println("Armstrong Number");
			else
				System.out.println("Not armstrong number");
		}

	

}
