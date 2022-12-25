package Arrays;

public class ReversArray {

	public static void main(String[] args) {
		
		System.out.println("Original array =");
		
		int arr[]= {10,20,30,40,50};
		
		for (int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i] +" ");
			
		}
		
		System.out.println(" ");
		System.out.println("Reversed array =");
		
		for (int j=arr.length-1;j>=0;j--) {
			
			System.out.print(arr[j]+" ");
		}
		


	}

}
