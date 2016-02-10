package lecture4;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateFinderTest {

	@Test
	public void test() {
		DuplicateFinder df = new DuplicateFinder();
		int x[] = { 1, 2, 4 };
		boolean b = df.findDuplicate(x);
		Assert.assertFalse(b);
		x = new int[] { 1, 1, 5 };
		b = df.findDuplicate(x);
		Assert.assertTrue(b);
		x = new int[] {1,5,2,1};
		b = df.findDuplicate(x);
		Assert.assertTrue(b);

	}

}
