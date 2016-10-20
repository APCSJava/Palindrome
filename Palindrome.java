/***
 * Collection of class methods for evaluating potential palindromes
 * @version	14 October, 2016
 * 
 * Sample solution
 *
 */
public class Palindrome {

	/**
	 * Removes white space and punctuation (non-letters) from a string.
	 * Method name - stripped
	 * Input - a string containing potentially letters and non-letters.
	 * Output - a version of the string with the original letters in sequence and 
	 * the non-letters removed.
	 */
	//Write the method header and your implementation below
	public static String stripped(String original) {
		String result = "";
		for (int i = 0; i<original.length(); i++) {
			char ch = original.charAt(i);
			if (Character.isLetter(ch)) result+=ch; // use the API!
		}
		return result;
	}
	
	/**
	 * Determines whether a character n-letters from the beginning of
	 * a stripped string matches the corresponding character n-letters from the 
	 * end of the stripped string.
	 * Method name - positionMatch
	 * Input - a string containing no non-letters
	 * Input - an integer representing the distance to index from the front/back
	 * Output - whether the two characters match
	 * @precondition index is less than the length of the string
	 */
	//Write the method header and your implementation below
	public static boolean positionMatch(String original, int index){
		if (original.length()<2) return true;
		int mirrorIndex = original.length()-index-1;
		return original.charAt(index) == original.charAt(mirrorIndex);
	}
	
	/**
	 * This method determines whether a string consisting solely of lower case 
	 * letters reads the same from the front as from the back.
	 * Method name - testString
	 * Input - a string containing only lower case letters
	 * Output - whether for each character in the string the corresponding 
	 * character from the back matches.
	 */
	//Write the method header and your implementation below
	public static boolean testString(String lower) {
		for (int i = 0; i<lower.length(); i++) {
			if (!positionMatch(lower, i)) return false;
		}
		return true;
	}
	
}