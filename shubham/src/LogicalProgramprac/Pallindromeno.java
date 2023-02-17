package LogicalProgramprac;

public class Pallindromeno {

	public static void main(String[] args) {

		int no =1223;
		int sum =0;
		for(sum=0;no>0;no=no/10) {
			
			int rem =no%10;
			
			sum =sum*10+rem;
		}
		
		System.out.println(sum);
		}

}

