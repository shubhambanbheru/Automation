package LogicalProgramprac;

public class Pallindromeno {

	public static void main(String[] args) {
		
		int input=123;
		int sum=0;
		for(sum =0;input>0;input=input/10) {		//123/10=12  12/10=1   1/10=0 
			
			int rem=input%10;		//123%%10=3     12%10=2     1%10=1
			
			sum=sum*10+rem;
		}
		
		System.out.println(sum);
	}
}
