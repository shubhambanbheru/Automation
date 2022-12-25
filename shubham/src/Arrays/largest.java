package Arrays;

public class largest {

	public static void main(String[] args) {
		
		int arr[]= {1,22313,2343,2332423,5423,4234,0};
		
		int max = arr[2];
		
		for (int i=0;i<arr.length ;i++) {
			
			if (arr[i]>max) {
				
				max=arr[i];
			}
	}
		System.out.println("The Largest number is:" + max);
	
}
}