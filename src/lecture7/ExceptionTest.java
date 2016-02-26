package lecture7;

import util.Util;

class ExceptionTest {
	public static void main(String args[]) throws BusNotRunningException,
			RainException {
		Student jia = new Student();
		// jia.comeToClass();

		// jia.comeToClassButDontKnowHowToHandleException();
		Student kerwin = new Student();
		kerwin.comeToClassAndHandleExceptionSeparately();
	}
}

class Student {

	public void comeToClassButDontKnowHowToHandleException()
			throws BusNotRunningException, RainException {
		takeABus();
		getDownAtBusStand();
		walkUptoUniversity();
		System.out.println("Sit in the class");
	}

	public void comeToClassAndHandleExceptionSeparately() {
		try {
			takeABus();
		} catch (BusNotRunningException bnre) {
			System.out.println("Bus not running exception");
			return;
		}
		getDownAtBusStand();

		try {
			walkUptoUniversity();
			System.out.println("Sit in the class");
		} catch (RainException re) {
			System.out.println("Rain exception");
		}

	}

	public void comeToClass() {
		try {
			takeABus();
			getDownAtBusStand();
			walkUptoUniversity();
			System.out.println("Sit in the class..");
		} catch (RainException re) {
			System.out.println("Encountered Rain -> {" + re.getMessage() + "}");
		} catch (BusNotRunningException bnre) {
			System.out.println("Bus is not running -> " + bnre.getMessage());
		} catch (Exception e) {
			System.out.println("Generic exception -> " + e.getMessage());
		} finally {
			// eatDinner();
		}
		System.out.println("All is well..");
	}

	private void eatDinner() {
		System.out.println("Eat Dinner..");

	}

	private void takeABus() throws BusNotRunningException {
		int x = getRandomNumber(10);
		if (x < 8) {
			if (x <= 2) {
				//throw new RuntimeException(
				//		"Some unexpected different type of exception");
			}

			System.out.println("Bus is on it's way");
			return;

		} else {
			System.out.println("Bus has some problem..");
			throw new BusNotRunningException("Bus has some problem ->" + x);
		}
	}

	private int getRandomNumber(int number) {
		return Util.getRandomNumber(number);
	}

	private void walkUptoUniversity() throws RainException {
		int number = getRandomNumber(10);
		if (number < 5) {
			System.out.println("Weather is pleasant. Walk to the university");
		} else {
			System.out.println("It's raining..");
			throw new RainException();
		}

	}

	private void getDownAtBusStand() {
		System.out.println("Getting down @ Bus stand");

	}
}

class BusNotRunningException extends Exception {
	public BusNotRunningException(String message) {
		super(message);
	}

}

class RainException extends Exception {

}
