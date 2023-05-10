package org.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final String FILENAME = "Documenti";
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int numOfBooks = getAIntNumberFromUser(in);
		Book[] books = new Book[numOfBooks];
		if(numOfBooks > 0) createBooks(numOfBooks , in , books);
		createAndCompileFileWithBooks(books, numOfBooks);
		printFileText();
		in.close();
	}
	
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
	
	public static void createBooks(int num , Scanner in , Book[] books) throws Exception {
		try {	
			for(int i=0 ; i<num ; i++) {
				System.out.println("--------------------------");
				
				System.out.print("Inserisci il nome del libro ");
				String bookName = in.next();
				
				System.out.print("Inserisci il numero di pagine ");
				int bookNumOfPages = in.nextInt();
				
				System.out.print("Inserisci il nome dell'autore ");
				String bookAuthor = in.next();
				
				System.out.print("Inserisci il nome dell'editore ");
				String bookEditor = in.next();
				
				Book book = new Book(bookName , bookNumOfPages , bookAuthor , bookEditor);
				
				books[i] = book;	
			}
			
			System.out.println(Arrays.toString(books));
		}catch(Exception e) {
			System.err.println("Errore: ");
		}
	}
	
	public static void createAndCompileFileWithBooks(Book[] books , int numOfBooks) {
		try {
			FileWriter myWriter = new FileWriter(FILENAME);
			
			for(int i=0 ; i<numOfBooks ; i++) {
				Book book = books[i];
				myWriter.write(book.toString());
			} 
			myWriter.close();
		}catch(Exception e) {
			System.err.println("Errore " + e.getMessage());
		}
	}
	
	public static void printFileText() throws FileNotFoundException {
		File file = new File(FILENAME);
		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		reader.close();
	}
	
}
