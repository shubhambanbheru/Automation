package Arrays;

public class TwoDiArray {

	public static void main(String[] args) {
	
	int	arr[][]= {{10,2,3,2},{10,23,33,2}};

	System.out.println(arr.length);	//rows
	System.out.println(arr[0].length);	//columns
	
	for (int i=0;i<arr.length;i++) {
		
		for(int j=0;j<arr[0].length;j++) {
			
			System.out.println(arr[i][j]);
		}
	}
	
	}

}