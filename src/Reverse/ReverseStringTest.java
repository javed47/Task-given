package Reverse;

import java.util.Scanner;

public class ReverseStringTest {
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Ask user to Give input
		System.out.println("Give the String or sentence");
		String toBeReversed = input.nextLine();
		// Call ReverseString object adn corresponding methods
		ReverseString rS = new ReverseString(toBeReversed);
		rS.reverse();
		rS.getResult();
	}
}
