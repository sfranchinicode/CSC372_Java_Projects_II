# Basic Library System — Java Portfolio Project

## Overview
A console-based library management system built in Java. The program allows users to add books, borrow and return them, search by title, and view the full inventory. The system uses two ArrayLists to track available and currently borrowed books.

---

## Project Structure
```
LibrarySystem/
├── Book.java         # Book class with fields, constructors, getters/setters, and printBookInfo()
├── Inventory.java    # Inventory class managing mainInventory and lendingInventory ArrayLists
├── Main.java         # Entry point with menu loop, user input handling, and exception handling
└── README.md
```

---

## Classes

### Book.java
Represents a single book in the library system.

**Fields (all private):**
| Field | Type | Description |
|-------|------|-------------|
| id | int | Unique identifier for each book |
| title | String | Title of the book |
| author | String | Author of the book |
| isbn | String | ISBN number (supports dashes and leading zeros) |
| pages | int | Number of pages |

**Methods:**
- Getters and setters for all 5 fields (with input validation)
- `Book()` — default constructor
- `Book(int id, String title, String author, String isbn, int pages)` — parameterized constructor
- `printBookInfo()` — prints all book details to the console

---

### Inventory.java
Manages the library's book collections using two ArrayLists.

**Fields:**
- `mainInventory` — books currently available to borrow
- `lendingInventory` — books currently checked out

**Methods:**
| Method | Description |
|--------|-------------|
| `addBook(int id, String title, String author, String isbn, int pages)` | Creates a new Book and adds it to mainInventory |
| `borrowBook(int id)` | Moves a book from mainInventory to lendingInventory by ID |
| `returnBook(int id)` | Moves a book from lendingInventory back to mainInventory by ID |
| `printAll()` | Displays all books in both inventories |
| `searchByTitle(String title)` | Searches mainInventory for partial/full title matches (case-insensitive), displays count and details |
| `getMainInventoryCount()` | Returns the number of books currently available |

---

### Main.java
Entry point for the program. Displays a menu and routes user input to the appropriate Inventory method.

**Menu Options:**
```
1. Add Book
2. Borrow Book
3. Return Book
4. Search by Title
5. Print All Books
6. Exit
```

---

## Features
- **Add Books** — Enter full book details to add to the library
- **Borrow Books** — Check out a book by ID; moves it to lending inventory
- **Return Books** — Return a borrowed book by ID; moves it back to main inventory
- **Search by Title** — Partial and case-insensitive title search with copy count display
- **Print All Books** — View all available and currently borrowed books
- **Exception Handling** — Invalid menu input is caught with `try...catch` using `InputMismatchException`
- **Input Validation** — Setters in Book class validate all fields and throw `IllegalArgumentException` for invalid data

---

## How to Compile and Run

Make sure all three `.java` files are in the same directory, then run:

```bash
javac Book.java Inventory.java Main.java
java Main
```

> No IDE required. Compiled and tested using command line with Notepad++ as the editor.

---

## Example Usage
```
1. Add Book
2. Borrow Book
3. Return Book
4. Search by Title
5. Print All Books
6. Exit
Enter choice: 1

Enter ID: 101
Enter title: The Dark Tower
Enter author: Stephen King
Enter ISBN: 978-0-451-21100-1
Enter pages: 313

Book added to the library.
```

```
Enter choice: 4

Enter the books title: dark

2 copies available!

ID: 101
Title: The Dark Tower
Author: Stephen King
ISBN: 978-0-451-21100-1
Pages: 313

ID: 102
Title: The Dark Tower II
Author: Stephen King
ISBN: 978-0-451-21101-8
Pages: 400
```
