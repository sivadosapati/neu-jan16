package lecture7;

import util.Util;

public class WalkOnTheRoad {
	public static void main(String args[]) throws SeattleRainException{
		// walkOnTexasRoads();
		//walkOnSeattleRoads();
		walkOnSeattleRoadsDontHandleRain();
	}

	private static void walkOnSeattleRoadsDontHandleRain() throws SeattleRainException{
		SeattleResident sr = new SeattleResident();
		for (int i = 0; i < 100; i++) {
			sr.walk();
			System.out.println(i + ".All is well..");
		}
		System.out.println("All DONE..");

	}

	private static void walkOnSeattleRoads() {
		try {
			SeattleResident sr = new SeattleResident();
			for (int i = 0; i < 100; i++) {
				try {
					sr.walk();
				} catch (Exception e) {
					System.out.println("Exception while walking -> " + i
							+ " time");
					continue;
				}
				System.out.println(i + ".All is well..");
			}
			System.out.println("All DONE..");
		} catch (Exception e) {
			System.out.println("Exception in walking on seattle roads..");
		}
	}

	private static void walkOnTexasRoads() {
		TexasResident tr = new TexasResident();
		for (int i = 0; i < 100; i++) {
			tr.walk();
			System.out.println(i + ".All is well..");
		}
		System.out.println("All DONE..");

	}
}

abstract class Resident {
}

class SeattleResident extends Resident {
	public void walk() throws SeattleRainException {
		int random = Util.getRandomNumber(50);
		if (random < 25) {
			System.out.println("Rain in Seattle -> very often");
			throw new SeattleRainException();
		} else {
			System.out.println("Walk on the Seattle Road..");
		}
	}
}

class SeattleRainException extends Exception {
}

class TexasResident extends Resident {
	public void walk() throws TexasRainException {
		int random = Util.getRandomNumber(100);
		if (random <= 2) {
			System.out.println("Rain in Texas (very rare)");
			throw new TexasRainException();
		} else {
			System.out.println("Walk on Texas Roads..");
		}
	}
}

class TexasRainException extends RuntimeException {
}
