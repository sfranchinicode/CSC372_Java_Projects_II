/* 
The Book class is used to gather the book details.
Whitespaces are trimed on the string variables to limit
compiling errors. Validation was included on all getters and 
setters. 
*/

public class Book {

    // Private fields (encapsulation)
    private int id;
	private String title;
	private String author;
	private String isbn;
	private int pages;
	
	// ID Getter and Setter
	public int getId() {
	    return id;
	}
	
	public void setId(int id) {
	    if (id <= 0) {
		    throw new IllegalArgumentException("ID must be a positive number.");
		}
		this.id = id;
	}
	
	// Title Getter and Setter
	public String getTitle() {
	    return title;
	}
	
	public void setTitle(String title) {
	    if (title == null || title.trim().isEmpty()) {
		    throw new IllegalArgumentException("Title cannot be null or empty");
		}
		this.title = title.trim();
	}
	
	// Author Getter and Setter 
	public String getAuthor() {
	    return author;
	}
	
	public void setAuthor(String author) {
	    if (author == null || author.trim().isEmpty()) {
		    throw new IllegalArgumentException("Author cannot be null or empty.");
		}
		this.author = author.trim();
	}
	
	// Isbn Getter and Setter
	public String getIsbn() {
	    return isbn;
	}
	
	public void setIsbn(String isbn) {
	    if (isbn == null || isbn.trim().isEmpty()) {
		    throw new IllegalArgumentException("ISBN cannot be null or empty.");
		}
		this.isbn = isbn.trim();
	}
	
	// Pages Getter and Setter
	public int getPages() {
	    return pages;
	}
	
	public void setPages(int pages) {
	    if (pages <=0) {
		    throw new IllegalArgumentException("Pages must be a positive number.");
		}
		this.pages = pages;
	}
	
	// Default Constructor left empty to avoid redundency
	public Book() {
	}
	
	// Parameterized Constructor
	public Book(int id, String title, String author, String isbn, int pages) {
		setId(id);
		setTitle(title);
		setAuthor(author);
		setIsbn(isbn);
		setPages(pages);
	}
	
	// Print out book information
	public void printBookInfo() {
		System.out.println("\nID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("ISBN: " + isbn);
		System.out.println("Pages: " + pages);
	}
}