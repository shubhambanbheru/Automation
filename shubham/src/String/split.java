package String;

public class split {

	public static void main(String[] args) {

		String s1= "1 2 3 4 5 6 7 8 9";
		
		String ar[]=s1.split(" ");
		
		System.out.println(ar.length);
				
		for (int i=0;i<=ar.length-1;i++) {
			
			System.out.print(ar[i]+" ");
		}
			
			
		}
		
	}
