package org.utilities;

import java.io.File;
import java.util.Scanner;

public class Utilities {
	public static int getAIntNumberFromUser(Scanner in) {
		int num = 0;
		
		try {
			System.out.print("Quanti libri vuoi inserire? ");
			num = in.nextInt();
			if(num<=0) throw new Exception("Devi inserire un numero maggiore di 0");
		}catch(Exception e) {
			System.err.println("Errore: " + e.getMessage());
		}

		return num;
	}
	
	public static void printFileText(String filePath) {
		try {
			File file = new File(filePath);
			Scanner reader = new Scanner(file);
			
			while(reader.hasNextLine()) {
				System.out.println(reader.nextLine());
			}
			
			reader.close();			
		}catch(Exception e){
			System.err.println("Errore nella lettura di nominativi.txt\n" + e.getMessage());
		}
	}
}
