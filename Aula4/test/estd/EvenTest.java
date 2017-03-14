package estd;

import org.junit.Assert;
import org.junit.Test;

public class EvenTest {

	@Test
	public void countEvensTest() {

		Even even = new Even();
		int[] nums = { 5, 6, 8, 1, 9 };

		int resultado = even.countEvens(nums);

		Assert.assertTrue(resultado == 2);
	}
}
