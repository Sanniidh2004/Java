// Base Class: Book
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }
}

// Subclass: EBook (Inheritance)
class EBook extends Book {
    private String fileFormat;

    // Constructor
    public EBook(String title, String author, String isbn, String fileFormat) {
        super(title, author, isbn); // Call parent class constructor
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }
}

// Library Class
import java.util.ArrayList;
import java.util.ArrayList;

class Library {
    private ArrayList<Book> books; // List to store Book/EBook objects

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            String status = book.isBorrowed() ? "Borrowed" : "Available";
            if (book instanceof EBook) {            // Check for EBook using Polymorphism
                EBook ebook = (EBook) book;
                System.out.println("Title: " + ebook.getTitle() + ", Author: " + ebook.getAuthor() + ", ISBN: " + ebook.getIsbn() + ", File Format: " + ebook.getFileFormat() + ", Status: " + status);
            } else {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn() + ", Status: " + status);
            }
        }
    }

    // Search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) { 
                System.out.println("Found: Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    // Delete a book from the library
    public void deleteBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Deleted: " + book.getTitle());
        }
    }

    // Borrow a book
    public void borrowBook(String title) {
        Book book = searchBook(title);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
            System.out.println("You borrowed: " + book.getTitle());
        } else if (book != null) {
            System.out.println("Sorry, " + book.getTitle() + " is already borrowed.");
        }
    }

    // Return a book
    public void returnBook(String title) {
        Book book = searchBook(title);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
            System.out.println("You returned: " + book.getTitle());
        } else if (book != null) {
            System.out.println(book.getTitle() + " wasn't borrowed.");
        }
    }
}

// Main Class (Example Usage)
public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library(); // Create Library object

        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "987654321"));
        library.addBook(new EBook("Digital Fortress", "Dan Brown", "112233445", "PDF"));

        library.displayBooks(); // Display all books
        library.borrowBook("1984"); // Borrow a book
        library.displayBooks(); // Display books to see updated status
        library.returnBook("1984"); // Return a book
        library.deleteBook("The Great Gatsby"); // Delete a book
    }
}
