package LogicalProgramprac;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Duplicatetwoarrays {

	public static void main(String[] args) {
		int arr1[] = { 10, 20, 32, 122, 322, 21, 2 };
		int arr2[] = { 20, 32, 12, 331, 131, 21 };

		// System.out.println(arr1);
		Intersection(arr1, arr2);
		union(arr1, arr2);
	}

	static void union(int arr1[], int arr2[]) {

		Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < arr1.length; i++) {

			s.add(arr1[i]);

		}

		for (int i = 0; i < arr2.length; i++) {
			s.add(arr2[i]);
		}
		System.out.println("Union : " + s);
	}

	static void Intersection(int arr1[], int arr2[]) {

		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {

			s.add(arr1[i]);

		}
		for (int i = 0; i < arr2.length; i++) {
			if (s.contains(arr2[i])) {
				System.out.println(arr2[i] + " ");
			}
		}
		{

		}
	}

}
