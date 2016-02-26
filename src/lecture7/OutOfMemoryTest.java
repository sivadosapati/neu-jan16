package lecture7;

public class OutOfMemoryTest {
	public static void main(String args[]) {
		BigSumCalculator a, b;
		try {
			a = new BigSumCalculator();
			a.findBigSum();
			System.out.println("All is well");
		} catch (Error error) {
			System.out.println("Error -> " + error);
		}
		for (int i = 0; i < 1000; i++) {
			new Object();
		}
		try {
			b = new BigSumCalculator();
			b.findBigSum();
		} catch (Error error) {
			System.out.println("Error -> " + error);
		}

	}
}

class BigSumCalculator {
	Object[] objects = new Object[Integer.MAX_VALUE];

	public void findBigSum() {
		long sum = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			objects[i] = new Object();
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
