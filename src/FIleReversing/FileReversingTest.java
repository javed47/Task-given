package FIleReversing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReversingTest {
    public static void main(String[] args) {

        try {
//			Create A filereader object and pass it to BufferdReader object
            long start = System.currentTimeMillis();
            FileReader fileToRead = new FileReader("FIle to change.txt");
            BufferedReader buffer = new BufferedReader(fileToRead);
            File outputFile = new File("FIle output.txt");
            FileReversing file = new FileReversing(buffer, outputFile);
            file.splitFile();
            fileToRead.close();
            long finish = System.currentTimeMillis();
            System.out.printf("%s%dms%n","The execution time needed: ", finish - start);
        } catch (IOException  e) {
            System.out.println("Error occured in main method.");
        }
    }
}
