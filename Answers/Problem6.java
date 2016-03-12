public class Problem6 {

	public static void main(String[] args) {
		System.out.println(removeVowels("California"));
		System.out.println(removeVowels("I pledge allegiance to the flag "
				+ "of the United States of America."));
	}
	
	/*
	 * Takes in a string as input, and returns that string without
	 * vowels
	 */
	public static String removeVowels(String input) {
		// Declare the eventual return variable
		String result = "";
		// For loop iterates through the chars of the input string
		for (int i = 0; i < input.length(); i++) {
			// Gets the current char, in lower case form
			char current = input.toLowerCase().charAt(i);
			// If current char is not a vowel, adds char to result
			if (!isVowel(current)) {
				result += current;
			}
		}
		// Returns result
		return result;
	}

	/*
	 * Returns true if char c is a vowel, or equal to the chars
	 * a, e, i, o, or u. Returns false if otherwise.
	 */
	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o'
				|| c == 'u';
	}

}
