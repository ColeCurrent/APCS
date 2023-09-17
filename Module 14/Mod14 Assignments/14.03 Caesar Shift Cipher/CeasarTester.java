import java.util.Scanner;
/**
 * This class compiles all the data from the encryption and decryption classes and provides a neat user interface
 *
 * @author Cole Current
 * @version 5/5/2020
 */
public class CeasarTester {
	public static void tester() {
		System.out.print("Would you like to decrypt, encrypt, or quit?(d, e, q): ");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		if (choice.equalsIgnoreCase("D")) {
			System.out.print("Message to decrypt: ");
			String message = in.nextLine();
			System.out.println();
			System.out.print("Shift Value(enter as an integer): ");
			String shift = in.next();
			int shiftInt = Integer.parseInt(shift);
			Decryption csd = new Decryption(shiftInt, message);
			csd.decryptMessage();
			csd.printDecryptedMessage();
			tester();
		} else if (choice.equalsIgnoreCase("E")) {
			System.out.print("Message to encrypt: ");
			String message = in.nextLine();
			System.out.print("Shift Value(enter as an integer): ");
			String shift = in.next();
			int shiftInt = Integer.parseInt(shift);
			Encryption cse = new Encryption(shiftInt, message);
			cse.encryptMessage();
			cse.printEncryptedMessage();
			tester();
		} else if (choice.equalsIgnoreCase("Q")) {
			System.out.println("Farewell");
		} else {
			System.out.println("Error: Not a Valid Entry");
			tester();
		}
	}
	
	public static void welcomeMessage() {
		System.out.println("                Welcome to the Ceasar Shift!");
		System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\");
	}
	
	public static void main(String[] args) {
		welcomeMessage();
		tester();
		System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\");
	}

}
