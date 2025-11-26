package project;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Remove a book by ID
    public void removeBook(int id) {
        boolean found = false;

        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    // Search a book by title
    public void searchBook(String title) {
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with that title.");
        }
    }

    // Display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
