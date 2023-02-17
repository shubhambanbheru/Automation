package practice;

public class Identify_Misssingno{

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		int sum = 0;
		int sum1 =0;

		for (int i = 1; i <=10; i++) {

			sum = sum + i;

		}
		//System.out.println(sum);
		
		for (int j=0;j<arr.length;j++) {
			
			sum1=sum1+arr[j];
		}
		//System.out.println(sum1);
		System.out.println("The no is = "+(sum-sum1));

	}
}
