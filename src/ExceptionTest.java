class Student {
	public void comeToClass() {
		try {
			takeABus();
			getDownAtBusStand();
			walkUptoUniversity();
		} catch (RainException re) {
			System.out.println("Encountered Rain...");
			return;
		} catch (BusNotRunningException bnre) {
			System.out.println("Bus is not running");
			return;
		}
		System.out.println("Sit in the class..");
	}

	private void takeABus() throws BusNotRunningException {
		// TODO Auto-generated method stub

	}

	private void walkUptoUniversity() throws RainException {
		// TODO Auto-generated method stub

	}

	private void getDownAtBusStand() {
		// TODO Auto-generated method stub

	}
}
