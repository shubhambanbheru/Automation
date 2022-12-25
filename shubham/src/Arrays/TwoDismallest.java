package Arrays;

public class TwoDismallest {

	public static void main(String[] args) {

		int a[][]= {{9,7,10,12},{32,21,6,9}};
		
		int min=a[1][0];
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
				if (a[i][j]<min) {
					
					min=a[i][j];
					
				}
			}
		}
	
		System.out.println("smallest no.is :"+" "+min);
	}

}
