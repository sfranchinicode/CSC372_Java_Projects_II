/*
Main class serves as the entry point for this Library System.
It displays a menu to the user and handles input to perform
operations such as adding, borrowing, returning, searching,
and displaying books using the Inventory class. 
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Inventory inventory = new Inventory();
		int choice = 0;
		
		while (choice != 6) {
            // Display menu options
			System.out.println("\n1. Add Book");
			System.out.println("2. Borrow Book");
			System.out.println("3. Return Book");
			System.out.println("4. Search by Title");
			System.out.println("5. Print All Books");
			System.out.println("6. Exit");
			System.out.println("\n4Enter choice: ");
			
			// Use a try catch to handle invalid inputs
			try {
				choice = scnr.nextInt();
				scnr.nextLine();
		    }
			catch (InputMismatchException e) {
				System.out.println("\nInvalid input. Please enter a number between 1-6.");
				scnr.nextLine(); // clear the bad input 
		    }
			switch (choice){
                // Prompt user for book details and add to inventory
				case 1: {
				    System.out.println("\nEnter ID: ");
					int id = scnr.nextInt();
					scnr.nextLine();
					System.out.println("Enter title: ");
					String title = scnr.nextLine();
					System.out.println("Enter author: ");
					String author = scnr.nextLine();
					System.out.println("Enter ISBN: ");
					String isbn = scnr.nextLine();
					System.out.println("Enter pages: ");
		            int pages = scnr.nextInt();
				    inventory.addBook(id, title, author, isbn, pages);
					System.out.println("\nBook added to the library.");
				    break;
				}
                // Prompt user for book ID and borrow from inventory
				case 2: {
				    System.out.println("\nEnter book ID: ");
					int id = scnr.nextInt();
					scnr.nextLine();
					inventory.borrowBook(id);
				    break;
				}
                // Prompt user for book ID and return to inventory
				case 3: {
				    System.out.println("\nEnter book ID: ");
					int id = scnr.nextInt();
					scnr.nextLine();
					inventory.returnBook(id);
				    break;
				}
                // Prompt user for title and search inventory
				case 4: {
				    System.out.println("\nEnter the books title: ");
					String title = scnr.nextLine();
					inventory.searchByTitle(title);
				    break;
				}
                // Print all books in both inventories
				case 5: {
				    System.out.println("\nPrinting all books.");
					inventory.printAll();
					System.out.println("\nThat is the end of the list of books.");
				    break;
				}
                // Exit the program
				case 6: {
				    System.out.println("\nExiting program. Thank you!");
					System.exit(0);
				    break;
				}
			}
		}
	}
}