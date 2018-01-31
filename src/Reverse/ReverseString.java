package Reverse;

public class ReverseString {

	// Instance variable
	private String string;
	private char[] character;
	private String result;

	// constructor with no argument
	public ReverseString() {
		this(null);
	}

	// Constructor With argument String
	public ReverseString(String string) {
		this.string = string;
	}

	// Accessor and mutator for String
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	// Method for reverse string
	public void reverse() {
		// Take the string into the character array
		this.character = string.toCharArray();
		// Count the last element of character array
		int z = character.length - 1;

		// Iterate through character array to change the characters
		for (int i = 0; i < character.length; i++) {
			// Break if the first counter and last counter gets equal or
			// interchange positions
			if (i == z || i > z)
				break;

			else {
				if (character[z] == '.')
				{
					z--;
				}
				char c = character[i];
				character[i] = character[z];
				character[z] = c;
			}
			z--;
		}
		// Make the result string
		this.result = new String(character);
	}

	// Eventually this is the reversed string giving method
	public String getResult() {
		return result;
	}

}
