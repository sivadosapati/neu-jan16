//Test
import org.junit.Assert;
import org.junit.Test;

public class MathTest {
	@Test
	public void testSum() {
		Math math = new Math();
		int result = math.sum(5, 15);
		int expectedResult = 20;
		Assert.assertTrue(expectedResult == result);
	}
}
