package javaPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shuffle {
	private static ArrayList<String> playlist = new ArrayList<String>();  //Array of music
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("\\Users\\User\\OneDrive\\Desktop\\Java Projects\\Music Shuffler\\src\\javaPackage\\Playlist.txt");
		Scanner scan = new Scanner(file);
		Scanner question = new Scanner(System.in);
		
		//Add unshuffled music from file into the playlist array
		while(scan.hasNextLine()) {
			playlist.add(scan.nextLine());
		}
		
		
		//Print unshuffled playlist
		System.out.println("UNSHUFFLED PLAYLIST");
		for(int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		}
		System.out.println();
		
		//Shuffle playlist
		shuffle();
		
		//Print shuffled playlist
		System.out.println("SHUFFLED PLAYLIST");
		for(int i = 0; i < playlist.size(); i++) {
			System.out.println(playlist.get(i));
		}
		System.out.println();
		
		
		//Reshuffle option
		System.out.println("Would you like to reshuffle? (y/n)");
		String ans = question.nextLine();
		System.out.println();
		
		while(ans.equals("y")) {
			shuffle();
			System.out.println("SHUFFLED PLAYLIST");
			for(int i = 0; i < playlist.size(); i++) {
				System.out.println(playlist.get(i));
			}
			System.out.println();
			
			System.out.println("Would you like to reshuffle? (y/n)");
			ans = question.nextLine();
			System.out.println();
		} 
			System.out.println("Ur gay lmao");
	}
	
	
	
	public static void shuffle() {
		Random rand = new Random();
		
		//Start at the end and decrement
		for (int i = playlist.size() - 1; i >= 1; i--) {
			
			//Generate random index j between 0 and i
			int j = rand.nextInt(i + 1);
			
			// swap element at i'th position in the list with element at
            // randomly generated index j
			String obj = playlist.get(i);
			playlist.set(i, playlist.get(j));
			playlist.set(j, obj);
		}
	}
}