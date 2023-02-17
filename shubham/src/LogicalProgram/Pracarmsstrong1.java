package LogicalProgram;

public class Pracarmsstrong1 {

	public static void main(String[] args) {
		
		int input =1634;    
		
		int sum=0;
		
		for(int i=input;i>0;i=i/10) {
			
			int rem=i%10;
			
			sum=sum+(rem*rem*rem*rem);
			
		}
		if(input==sum) {
			System.out.println("It is an armstring number = "+ sum);
		}
		else{
			System.out.println("It is not an armstring number = "+ sum);

		}
	}
}
