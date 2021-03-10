/**
 * 
 * @author eltob
 * Tobie Collins
 * Assignment 3
 * 3/6/21
 * 
 * String encryption/decryption
 */


public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		for (int i = 0; i < plainText.length(); i++)
		{
			// Check to see if input string is within the bounds.
			
			if (plainText.charAt(i) > LOWER_BOUND && plainText.charAt(i) < UPPER_BOUND)
			{
				continue;
			}
			else if(plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND)
			{
				return false;
			}

		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		

		int aboveBound = 0;			// the offset value of the character.
		String encryptedString = "";
		
		for (int i = 0; i < plainText.length(); i++)
		{
			aboveBound = plainText.charAt(i) + key;
			
			while (aboveBound > UPPER_BOUND)	// If offset is above range, reduce by range.
			{
				aboveBound -= RANGE;
			}
			
			encryptedString += (char) aboveBound;	// Form the final string by adding the 
													// offset's as characters to a string
		}
		
		return encryptedString;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		String encryptedString = "";
		int offset = 0;			// Offset value
		
		for (int i = 0; i < plainText.length(); i ++)
		{
			while (bellasoStr.length() < plainText.length())	// Extends the string used as a key
			{													// to the length of the input one.
				bellasoStr += bellasoStr;
			}
			
			offset = plainText.charAt(i) + bellasoStr.charAt(i);
			
			while (offset > UPPER_BOUND)	// Wrap around to get offset within range
			{
				offset -= RANGE;
			}
			
			encryptedString += (char) offset;
		}
		return encryptedString;
		
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		
		String decryptedString = "";
		int belowBound = 0;		// Declare offset value
		
		for (int i = 0; i < encryptedText.length(); i++)
		{
			belowBound = encryptedText.charAt(i) - key;		// Define offset value
			
			while (belowBound < LOWER_BOUND)	// Offset correction to within range
			{
				belowBound += RANGE;
			}
			
			decryptedString += (char) belowBound;
			
		}
		
		return decryptedString;
		
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		
		String decryptedString = "";
		int belowBound = 0;
		
		for (int i = 0; i < encryptedText.length(); i++)
		{
			while(bellasoStr.length() < encryptedText.length())		// Makes sure the key used to decipher
			{														// the string is extended to its length.
				bellasoStr += bellasoStr;
			}
			
			belowBound = encryptedText.charAt(i) - bellasoStr.charAt(i);	// Define offset value
			
			while (belowBound < LOWER_BOUND)	// Correct value by wrapping around
			{
				belowBound += RANGE;
			}
			
			decryptedString += (char) belowBound;
		}
		
		return decryptedString;
	}
}