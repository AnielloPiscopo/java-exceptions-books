package org.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int numOfBooks = getAIntNumberFromUser();
		Scanner in = new Scanner(System.in);
		
		Book[] books = new Book[numOfBooks];
		
		for(int i=0 ; i<numOfBooks ; i++) {
			System.out.println("--------------------------");
			
//			System.out.print("Inserisci il nome del libro ");
//			String bookName = in.next();
//			
//			System.out.print("Inserisci il numero di pagine ");
//			int bookNumOfPages = in.nextInt();
//			
//			System.out.print("Inserisci il nome dell'autore ");
//			String bookAuthor = in.next();
//			
//			System.out.print("Inserisci il nome dell'editore ");
//			String bookEditor = in.next();
			
			Book book = new Book("asd" , 12 , "asd" , "shish");
			
			books[i] = book;
			
			in.close();
		}
		
		System.out.println(Arrays.toString(books));
	
	}
	
	public static int getAIntNumberFromUser() {
		Scanner in = null;
		int num = 0;
		
		try {
			System.out.print("Quanti libri vuoi inserire? ");
			in = new Scanner(System.in);
			num = in.nextInt();
		}catch(Exception e) {
			System.err.println("Errori" + e.getMessage());
		}finally {
			in.close();
		}
		
		return num;
	}
	
	public static void createBooks(int numOfBooks) {
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
			
			Book book = new Book("asd" , 12 , "asd" , bookEditor);
			
			books[i] = book;
			
			in.close();
		}
	}
}
