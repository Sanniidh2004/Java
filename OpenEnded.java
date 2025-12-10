import java.util.ArrayList;

// Parent Class: Book
class Book {
    String title, author, isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
}

// Subclass: EBook (Inheritance)
class EBook extends Book {
    String fileFormat;

    public EBook(String title, String author, String isbn, String fileFormat) {
        super(title, author, isbn);
        this.fileFormat = fileFormat;
    }
}

// Library Class
class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.title);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            String status = book.isBorrowed ? "Borrowed" : "Available";
            // Check if the book is an instance of EBook (Polymorphism)
            if (book instanceof EBook) {
                EBook eBook = (EBook) book; // Downcasting
                System.out.println("Title: " + eBook.title + ", Author: " + eBook.author + 
                                   ", ISBN: " + eBook.isbn + ", File Format: " + eBook.fileFormat + 
                                   ", Status: " + status);
            } else {
                System.out.println("Title: " + book.title + ", Author: " + book.author + 
                                   ", ISBN: " + book.isbn + ", Status: " + status);
            }
        }
    }

    // Method to search for a book by title
    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                System.out.println("Found: Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn);
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    // Method to delete a book from the library
    public void deleteBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Deleted: " + book.title);
        }
    }

    // Method to borrow a book
    public void borrowBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            if (!book.isBorrowed) {
                book.isBorrowed = true;
                System.out.println("You borrowed: " + book.title);
            } else {
                System.out.println("Sorry, " + book.title + " is already borrowed.");
            }
        }
    }

    // Method to return a book
    public void returnBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            if (book.isBorrowed) {
                book.isBorrowed = false;
                System.out.println("You returned: " + book.title);
            } else {
                System.out.println(book.title + " wasn't borrowed.");
            }
        }
    }
}

// Example Usage
public class OpenEnded {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "987654321"));
        library.addBook(new EBook("Digital Fortress", "Dan Brown", "112233445", "PDF"));

        library.displayBooks();
        library.borrowBook("1984");
        library.displayBooks();
        library.returnBook("1984");
        library.deleteBook("The Great Gatsby");

        System.out.println("\nSubmitted By ~ SANNIDHI DEB (2330044)");
    }
}
