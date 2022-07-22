package exceptionhandlingpractice;

public class nullPointerException {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println("length of string:" + s.length());
		} catch (NullPointerException e) {
			System.out.println("null does not have length.");

		}
	}

}
