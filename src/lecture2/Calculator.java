package lecture2;

public class Calculator {

	Integer addNumbers(Integer one, Integer two) {
		Integer result;
		result = one + two;
		return result;
	}

	int sum(int maxNumber) {
		int total = 0;
		for (int i = 1; i <= maxNumber; i++) {
			total = total + i;
		}
		return total;
	}

	int sumBySkippingMultiplesOfThree(int maxNumber) {
		int total = 0;
		for (int i = 1; i <= maxNumber; i++) {
			if (i % 3 == 0) {
				continue;
			}
			total = total + i;
		}
		return total;

	}

	public static void main(String args[]) {
		Calculator myCalculator = new Calculator();
		Integer one = Integer.parseInt(args[0]);
		Integer two = Integer.parseInt(args[1]);
		Integer result = myCalculator.addNumbers(one, two);
		System.out.println(one + "+" + two + "=" + result);

		Calculator c = new Calculator();
		System.out.println(c.sum(5));
		System.out.println(c.sumBySkippingMultiplesOfThree(5));
		System.out.println(c.sum(10));
	}
}
