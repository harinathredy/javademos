package exceptionhandlingpractice;

public class arrayindex {
	public static void main(String[] args) {
		int arr[] = { 10, 32, 43, 54, 33 };

		System.out.println("length of array is:" + arr.length);
		System.out.println("Elements os array:");
		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bound.");
		}

		System.out.println("Elements of array are printed.");
	}

}
