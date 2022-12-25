package LogicalProgramprac;

public class DuplicateSinglearray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,23,4,12,11,1,23,12};
		
		for (int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if (arr[i]==arr[j]) {
					
					System.out.print(arr[j] +" ");
				}
			}
		}
	}
}
