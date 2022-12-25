package LogicalProgramprac;

public class Palindrome {

	public static void main(String[] args) {
		
		String name ="Shubham";
		String rev ="";
		String rev1 ="";
		
		for (int i=name.length()-1;i>=0;i--) {
			rev =rev+name.charAt(i);
			
		}
		System.out.println(rev);
		
		for(int j=0;j<name.length();j++) {
			rev1 =rev1+name.charAt(j);
		}
		System.out.println(rev1);
	}
}
