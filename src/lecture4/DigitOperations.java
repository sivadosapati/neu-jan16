package lecture4;

public class DigitOperations {
	public int countDigits(int x) {
		if (x == 0) {
			return 1;
		}
		int count = 0;

		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	public static void main(String args[]) {
		DigitOperations dop = new DigitOperations();
		System.out.println(dop.countDigits(11111));
		System.out.println(dop.countDigits(10));
	}
}
