package FIleReversing;

import Reverse.ReverseString;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReversing {
    private BufferedReader inputFile;
    private File outputFile;

    public FileReversing(BufferedReader inputFile, File outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void splitFile() throws IOException {
        ReverseString reverseWord = new ReverseString();
        boolean change = true;
        try(PrintWriter writer = new PrintWriter(outputFile)){;
        while (change) {
            StringBuilder buildNew = new StringBuilder();
            String check = inputFile.readLine();
            if (check == null) {
                change = false;
                break;
            }
            String[] words = check.split(" ");
            for (int j = 0; j < words.length; j++) {

                reverseWord.setString(words[j]);
                reverseWord.reverse();
//				Append the reversed word with a space
                buildNew.append(reverseWord.getResult()).append(" ");
            }
            buildNew.append(System.lineSeparator());
            writer.write(buildNew.toString());
        }
        }
    }
}
