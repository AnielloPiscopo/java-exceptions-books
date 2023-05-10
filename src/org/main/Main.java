package org.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = null;
		
		try {
			System.out.println("Quanti libri vuoi inserire? ");
			in = new Scanner(System.in);
		}catch(Exception e) {}finally {
			in.close();
		}
	}
}
