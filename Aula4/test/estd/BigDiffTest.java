package estd;

import org.junit.Assert;
import org.junit.Test;

public class BigDiffTest {
		@Test
		public void difBigDiff() {

			BigDiff bigDiff = new BigDiff();
			int[] nums = { 5, 6, 8, 1, 9 };

			int resultado = bigDiff.bigDiff(nums);

			Assert.assertTrue(resultado == 8);
		}
	}
