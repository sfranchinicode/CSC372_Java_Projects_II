/*
Inventory java class which will hold two ArrayLists (mainInventory)
and (lendingInventory) to show which books are available and which 
books are currently being borrowed. 
*/

import java.util.ArrayList;

public class Inventory {
    
	// Initialize the lists
    private ArrayList<Book> mainInventory = new ArrayList<>();
    private ArrayList<Book> lendingInventory= new ArrayList<>();
	
	// Add book to mainInventory
	public void addBook(int id, String title, String author, String isbn, int pages) {
	    Book book = new Book(id, title, author, isbn, pages);
		mainInventory.add(book);
	}
	
	// Add book to lendingInventory
	public void borrowBook(int id) {
		for (Book book : mainInventory) {
			if (book.getId() == id) {
				lendingInventory.add(book);
				mainInventory.remove(book);
				System.out.println("\nBook Successfully borrowed.");
				return;
			}
		}
		System.out.println("\nBook not found or is already being borrowed.");
	}
	
	// Handling a returned book
	public void returnBook(int id) {
		for (Book book : lendingInventory) {
			if (book.getId() == id) {
				mainInventory.add(book);
				lendingInventory.remove(book);
				System.out.println("\nBook successfully returned.");
				return;
			}
		}
		System.out.println("\nBook not found in lended inventory. Please add book to main inventory.");
    }
	
	// Print all books 
	public void printAll() {
		System.out.println("\nBooks in main inventory: ");
		for (Book b : mainInventory) {
			b.printBookInfo();
		}
		System.out.println("\nBooks being borrowed: ");
		for (Book b : lendingInventory) {
			b.printBookInfo();
		}
	}
	
	// Search by title using a boolean 
	public void searchByTitle(String title) {
		boolean found = false;
		int count = 0; 

		// Get number of matches for a title
		for (Book book : mainInventory) {
			if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
				count++;
			}
		}
		// Print all available copies
		if (count >=0) {
			System.out.println("\n" + count + " copies available!");
			for (Book book : mainInventory) {
				if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
					book.printBookInfo();
					found = true;
				}
			}
		}
		if (!found) {
			System.out.println("\nNo matching book found");
		}
	}
}