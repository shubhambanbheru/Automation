package Arrays;

public class TwoDiLargest {

	public static void main(String[] args) {

		int a[][]= {{1,23,3244,3,54},{22,2223,23,33,98}};
		
		int max =a[0][1];
		
		for (int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[0].length;j++) {
				
			if(	a[i][j]>max) {
				
				max=a[i][j];
			}
				
			}
		}
	
		System.out.println("Largest number is:"+" "+max);
	}

}
