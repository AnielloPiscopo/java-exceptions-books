package org.main;

import org.utilities.*;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final String FILENAME = "Documenti";
	
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		
		
		int numOfBooks = Utilities.getAIntNumberFromUser(in);
		Book[] books = new Book[numOfBooks];
		if(numOfBooks > 0) createBooks(numOfBooks , in , books);
		
		
		createAndCompileFileWithBooks(books, numOfBooks);
		Utilities.printFileText(FILENAME);
		
		
		in.close();
	}
	
	public static void createBooks(int num , Scanner in , Book[] books) throws Exception {
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
			
			try {	
				Book book = new Book(bookName , bookNumOfPages , bookAuthor , bookEditor);	
				books[i] = book;	
				
			}catch(IndexOutOfBoundsException e){
				i--;
				System.err.println("Errore: " + e.getMessage());
			}catch(Exception e) {
				i--;
				System.err.println("Errore: " + e.getMessage());
			}
		}
		
		System.out.println(Arrays.toString(books));
	}
	
	public static void createAndCompileFileWithBooks(Book[] books , int numOfBooks) {
		try {
			FileWriter myWriter = new FileWriter(FILENAME);
			
			for(int i=0 ; i<numOfBooks ; i++) {
				Book book = books[i];
				myWriter.write(book.toString());
			} 
			
			myWriter.close();
		}catch(IndexOutOfBoundsException e){
			System.err.println("Errore: ");
		}catch(Exception e) {
			System.err.println("Errore " + e.getMessage());
		}
	}
}
