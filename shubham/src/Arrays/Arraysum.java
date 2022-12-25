package Arrays;

public class Arraysum {

	public static void main(String[] args) {

		int sum =0;
				
		int arr[]= {10,20,30,100};
		
		for (int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
			
			
		}
			
		System.out.println("Sum Of all the Elements ="  + " "+sum);
	}

}
