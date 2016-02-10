package lecture4;

public class DuplicateFinder {

	public boolean findDuplicate(int[] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] == x[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
