package prog13_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Before;


public class Test extends TestCase {
	static File insert;
	private String expectedText = "This is the file you are seeking!";
	private String setupDirectory = "/Users/faysalmazed/Desktop/FPP/Lab13/src/prog13_1/";
	private String targetFile = "seek.txt";
	@Before
	public void setUp() {
		File f = new File("/Users/faysalmazed/Desktop/testCode/level1/level2/finalLevel");
		System.out.println(f.mkdirs());
		f = new File("/Users/faysalmazed/Desktop/testCode/level1/level2a/thirdLevel");
		System.out.println(f.mkdirs());
		f = new File("/Users/faysalmazed/Desktop/testCode/level1/level2b/thirdLevelb");
		System.out.println(f.mkdirs());
		f = new File("/Users/faysalmazed/Desktop/testCode/level1/level2b/thirdLevelc/fourthLevel");
		System.out.println(f.mkdirs());
		insert = new File(f.getAbsolutePath() + "/seek.txt");
		System.out.println("writing to " + insert.getAbsolutePath());
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(insert)));
			pw.write(expectedText);
			pw.flush();
			pw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	@org.junit.Test
	public void testSearchForFile() {
		boolean result = FileSearch.searchForFile(targetFile, setupDirectory);
		assertTrue(result);
		assertTrue(expectedText.equals(FileSearch.newText.trim()));
	}
}
