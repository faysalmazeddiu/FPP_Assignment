package prog2_8;

import static org.junit.Assert.*;

import org.junit.Test;
public class Prog2_8Test {

	@Test
	public void test() {
		int[] testArr= {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int result=Prog2_8.min(testArr);
		int expect= -22;
		assertTrue(result==expect);
	}

}
