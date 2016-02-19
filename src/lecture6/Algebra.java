package lecture6;

class Algebra {
	public static void main(String args[]) {
		Algebra a = new Algebra();
		a.doMath(15, 0);
	}

	void doMath(int a, int b) {
		System.out.println(sum(a, b));
		try {
			System.out.println(divide(a, b));
		} catch (Exception e) {
			System.out
					.println("Do nothing and move on. You are trying to divide by 0");
		}
		System.out.println(multiply(a, b));
		System.out.println(subtract(a, b));
	}

	float sum(int a, int b) {
		return a + b;
	}

	float divide(int a, int b) {
		return a / b;
	}

	float divideOld(int a, int b) {
		try {
			return a / b;
		} catch (Exception e) {
			System.out.println("I got a 0 and I'm returning 0 to move on..");
			return 0;
		}
	}

	float multiply(int a, int b) {
		return a * b;
	}

	float subtract(int a, int b) {
		return a - b;
	}
}
