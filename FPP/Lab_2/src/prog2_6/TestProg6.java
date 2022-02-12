package prog2_6;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
public class TestProg6 {
 
	@Test
	public void testRemoveDups() {
		String[] testData={"Faysal","Fahad","hello","Faysal"};
		String[] result =Prog6.removeDups(testData);
		String[] expectedArr= {"Faysal","Fahad","hello"};
		assertTrue(Arrays.equals(result, expectedArr));
	}
	

}

