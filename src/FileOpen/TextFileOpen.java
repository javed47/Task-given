package FileOpen;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import Reverse.ReverseString;

public class TextFileOpen {
	//	Create BufferReader, StringBuilder and Arraylist variable
	private BufferedReader file;
	private StringBuilder buildNew;
	private ArrayList<String> line = new ArrayList<String>();
	//Constructor with a BufferReader and StringBuilder arguments
	public TextFileOpen(BufferedReader file, StringBuilder buildnew) {
		this.file = file;
		this.buildNew = buildnew;
	}
	//Split and pass lines to an arraylist object to reserve the lines seperately
	public void splitLine() {
		boolean charge = true;
		//Check the charge boolean if true and iterate untill all the lines are read
		while(charge == true)
		{try {
			String check = file.readLine();
		//If the string is null make the charge boolean false to stop the method
			if(check == null)
			{
				charge = false;
			}
			//Add the lines in the arraylist object
				line.add(check);
			} catch (IOException  e) {
				System.out.println(" Problem occured.");
			}
	}}
	//Split the words and reverse the words accordingly
	public void reverseWord() {
		ReverseString reverse = new ReverseString();
		//Read the elements of the arraylist object
		for (String e : line ) {
			if(e == null)
				break;
//			Split the words in an string array of words
			String[] words = e.split(" ");
// 			Iterate till the words String are finished reversing
			for (int j = 0; j < words.length; j++) {
				reverse.setString(words[j]);
				reverse.reverse();
				words[j] = reverse.getResult();
//				Append the reversed word with a space
				buildNew.append(words[j]).append(" ");
			}
//			Append the line seperator
			buildNew.append(System.lineSeparator());
		}
		try{
			file.close();
		}catch (IOException e){

		}
	}

	public void getResult() {
		System.out.printf("%s%n%s", "The reversed text file output would be: ", buildNew.toString());
	}
}
