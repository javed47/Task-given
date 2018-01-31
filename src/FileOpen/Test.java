package FileOpen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
//	Main method
	public static void main(String[] args) {

		try {
//			Create A filereader object and pass it to BufferdReader object
			FileReader fileToRead = new FileReader("FIle to change.txt");
			BufferedReader buffer = new BufferedReader(fileToRead);
			StringBuilder newOutput = new StringBuilder();
//			Instanciate TextFileOpen object
			long startTime = System.nanoTime();
			TextFileOpen file = new TextFileOpen(buffer, newOutput);
			file.splitLine();
			file.reverseWord();
			file.getResult();
			long finishTime = System.nanoTime();
			System.out.printf("%s%dms%n","Time elapsed in the process: ",(finishTime - startTime) / 1000000);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	} 
}
