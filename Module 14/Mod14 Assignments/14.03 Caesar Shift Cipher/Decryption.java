import java.util.ArrayList;
/**
 * This class decrypts a message given from the user in the CeasarTester class
 *
 * @author Cole Current
 * @version 5/5/2020
 */
public class Decryption{
	private static int shift;
	private static String message;
	private static ArrayList<Character> Alphabet = new ArrayList<Character>();
	private static ArrayList<Character> newMessage = new ArrayList<Character>();
	
	public static void setupAlphabet() {
		for (int i = 97; i < 123; i++) {
			char letter = (char)i;
			Alphabet.add(letter);
		}
	}
	
	Decryption(int s, String m) {
		shift = s;
		message = m;
		setupAlphabet();
	}
	
	public static void decryptMessage() {
		message = message.trim();
		char[] msgInput = message.toCharArray();
		for (int i = 0; i < msgInput.length; i++) {
			if (msgInput[i] == ' ') {
				newMessage.add(msgInput[i]);
			} else {
				int asciiToEncrypt = (int)msgInput[i];
				asciiToEncrypt = asciiToEncrypt - shift;
				if (asciiToEncrypt > 123) {
					int overflow = asciiToEncrypt + 123;
					int encryption = 97 - overflow;
					char letter = (char)encryption;
					newMessage.add(letter);
				} else {
					char letter = (char)asciiToEncrypt;
					newMessage.add(letter);
				}
			}
			
		}
	}
	
	public static int getShift() {
		return shift;
	}
	
	public static void printDecryptedMessage() {
		System.out.print("Encrypted Message: ");
		for (int i = 0; i < newMessage.size(); i++) {
			System.out.print(newMessage.get(i));
		}
		System.out.println();
		System.out.println("Shift Used: " + getShift());
	}
}