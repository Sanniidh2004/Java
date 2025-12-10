import java.util.ArrayList;

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

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.title);
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            String status = book.isBorrowed ? "Borrowed" : "Available";
            System.out.println("Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn + ", Status: " + status);
        }
    }

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

    public void deleteBook(String title) {
        Book book = searchBook(title);
        if (book != null) {
            books.remove(book);
            System.out.println("Deleted: " + book.title);
        }
    }

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

public class OpenEndedExperiment_JAVA {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", "123456789"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "987654321"));
        library.displayBooks();
        library.borrowBook("1984");
        library.displayBooks();
        library.returnBook("1984");
        library.deleteBook("The Great Gatsby");
        System.out.println("\nSubmitted By ~ SANNIDHI DEB (2330044)");
    }
}
