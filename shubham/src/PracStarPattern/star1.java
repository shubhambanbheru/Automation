package PracStarPattern;

public class star1 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=7;j++) {
				
				if(j>=5-i && j<=3+i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		for(int k=5;k<=7;k++) {
			
			for(int m=1;m<=7;m++) {
				
				if(m>=k-3 && m<=11-k) {
					
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
