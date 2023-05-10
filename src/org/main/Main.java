package org.main;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final String FILENAME = "Documenti";
	
	public static void main(String[] args) throws Exception {
//		int numOfBooks = getAIntNumberFromUser();
//		createBooks(numOfBooks);
		Scanner in = null;
		int numOfBooks = 0;
		
		try {
			System.out.print("Quanti libri vuoi inserire? ");
			in = new Scanner(System.in);
			numOfBooks = in.nextInt();
		}catch(Exception e) {
			System.err.println("Errori " + e.getMessage());
		}
		
		Book[] books = new Book[numOfBooks];
		
		for(int i=0 ; i<numOfBooks ; i++) {
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
		
		File file = new File(FILENAME);
		Scanner reader = new Scanner(file);
		while(reader.hasNextLine()) {
			System.out.println(reader.nextLine());
		}
		in.close();
	}
	
	public static int getAIntNumberFromUser() {
		Scanner in = null;
		int num = 0;
		
		try {
			System.out.print("Quanti libri vuoi inserire? ");
			in = new Scanner(System.in);
			num = in.nextInt();
		}catch(Exception e) {
			System.err.println("Errori " + e.getMessage());
		}finally {			
			in.close();
		}
		
		return num;
	}
	
	public static void createBooks(int numOfBooks) throws Exception {
		Scanner in = new Scanner(System.in);
		
		Book[] books = new Book[numOfBooks];
		
		for(int i=0 ; i<numOfBooks ; i++) {
			System.out.println("--------------------------");
			
			System.out.print("Inserisci il nome del libro ");
			String bookName = in.next();
			
			System.out.print("Inserisci il numero di pagine ");
			int bookNumOfPages = in.nextInt();
			
			System.out.print("Inserisci il nome dell'autore ");
			String bookAuthor = in.next();
			
			System.out.print("Inserisci il nome dell'editore ");
			String bookEditor = in.next();
			
			Book book = new Book("asd" , 12 , "asd" , "asd");
			
			books[i] = book;
			
		}
		in.close();
		System.out.println(Arrays.toString(books));
	}
}
