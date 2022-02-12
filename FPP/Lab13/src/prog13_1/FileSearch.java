package prog13_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * //PSEUDO-CODE boolean searchForFile(Object file, Object startDir) { Object[]
 * fileSystemObjects = startDir.getContents(); for(Object o: fileSystemObjects)
 * { //base case if(isFile(o) && isSameFile(o,f)) { return true; }
 * 
 * if(isDirectory(o)) { searchForFile(file, o); } } //file not found in startDir
 * return false; }
 */

public class FileSearch {
	private static String FILE_DIRECTORY = "/Users/faysalmazed/Desktop/testCode/";
	static boolean foundFile = false;
	static String newText = "";
	public static void main(String[] args) {
		FileSearch filesearchs = new FileSearch();
		boolean checkFileFound = filesearchs.searchForFile("seek.txt", FILE_DIRECTORY);
		System.out.println(checkFileFound);
		System.out.println(newText);
	}
	
	
	public static void readFile(File file) {
		try {
			BufferedReader bufferReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferReader.readLine()) != null) {
				newText += line;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	public static boolean searchForFile(String filename, String startDir) {
		// implement
		File directorySource = new File(startDir);
		File[] fileArray = directorySource.listFiles((dir, name) -> !name.equals(".DS_Store"));
		for (File fileInfo : fileArray) {
			if (fileInfo.isFile() && checkForSameFile(fileInfo, filename)) {
				readFile(fileInfo);
				foundFile = true;
			}
			if (fileInfo.isDirectory()) {
				searchForFile(filename, fileInfo.getAbsolutePath());
			}
		}
		return foundFile;
	}

	public static boolean checkForSameFile(File fileObj, String fileName) {
		Path filePath = Paths.get(fileObj.getAbsolutePath());
		return filePath.getFileName().toString().equals(fileName);
	}

	

	

}
