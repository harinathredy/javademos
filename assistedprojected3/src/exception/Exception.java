package exception;

public class Exception {
	public static void main(String[] args) {
		int arr[] = { 10, 23, 43, 11, 24, 235, 32, 45 };
		System.out.println("Elements of Array are: ");
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("Error Occured...!");
		}

	}

}
