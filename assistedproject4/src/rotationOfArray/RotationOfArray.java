package rotationOfArray;

import java.util.Arrays;

public class RotationOfArray {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int n = 2;
		for (int k = 0; k < n; k++) {
			int first = arr[0];

			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = first;
		}
		
		System.out.println("\nresult array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

}
