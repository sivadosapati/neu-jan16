package lecture2;

public class Assignment2 {

	public boolean isUglyOld(long n) { // correct answer
		if (n <= 0)
			return false;
		while (n % 2 == 0)
			n = n / 2;
		while (n % 3 == 0)
			n = n / 3;
		while (n % 5 == 0)
			n = n / 5;
		return n == 1;
	}

	public boolean isUgly(long n) {
		while (n >= 2) {
			// System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				continue;
			}
			if (n % 3 == 0) {
				n = n / 3;
				continue;
			}
			if (n % 5 == 0) {
				n = n / 5;
				continue;
			}
			return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Assignment2 a = new Assignment2();
		// System.out.println(a.isUgly(15));
		long start = System.nanoTime();
		boolean b = a.isUgly(141221212166666888L);
		long end = System.nanoTime();
		long diff = end - start;
		System.out.println("Ugly -> "+diff + " " + b);

		
		start = System.nanoTime();
		b = a.isUglyOld(141221212166666888L);
		end = System.nanoTime();
		diff = end - start;
		System.out.println("Old Ugly -> "+diff + " " + b);

	}
}
