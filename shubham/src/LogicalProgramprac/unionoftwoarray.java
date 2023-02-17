package LogicalProgramprac;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class unionoftwoarray {

	public static void main(String[] args) {
		int arr1[] ={1,2,3,5,12,33,6};
		int arr2[] ={1,3,2,4,6,14,41,12};
 union(arr1,arr2);
		intersection(arr1, arr2);
		
		}
	static void union(int arr1[], int arr2[]){

		Set<Integer> s=new TreeSet<>();

		
		for(int i=0;i<arr1.length;i++){

		s.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++){
		s.add(arr2[j]); 
		}

		System.out.println("Union = "+s);
	}
	
	static void intersection(int arr1[],int arr2[]){
		Set<Integer> s=new HashSet<>();

		for(int i=0;i<arr1.length;i++){
		s.add(arr1[i]);
		}

		for(int i=0;i<arr2.length;i++){
		if(s.contains(arr2[i])){
		System.out.print(arr2[i] +" " );
		}
		}
}
}