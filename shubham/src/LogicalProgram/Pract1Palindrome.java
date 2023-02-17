package LogicalProgram;

public class Pract1Palindrome {

	public static void main(String[] args) {
		
		int num =1234;
		
		int sum =0;
		
		for (int i=num;i>0;i=i/10) {
			
			int rem =i%10;
			System.out.println("rem = "+ rem );
			//i=1234 %10 =123;
		//	i=123 %10 =12
			
		//	rem=3
			
			sum=(sum*10)+rem;
		//	sum =(4*10)+3 =43
			System.out.println("sum = "+sum);
		}
		
		System.out.println(sum);
		
	}
}
