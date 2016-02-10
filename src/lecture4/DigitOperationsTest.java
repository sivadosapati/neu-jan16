package lecture4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DigitOperationsTest {

	@Test
	public void test() {
		DigitOperations dop = new DigitOperations();
		int count = dop.countDigits(100);
		Assert.assertTrue(count == 3);
		count = dop.countDigits(-100);
		Assert.assertTrue(count == 3);
		count = dop.countDigits(0);
		Assert.assertTrue(count == 1);
	}

}
