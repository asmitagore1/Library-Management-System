package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("----- Library Books -----");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public Book findBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    public void issueBook(int id) {
        Book b = findBook(id);
        if (b == null) {
            System.out.println("Book not found!");
        } else if (b.isIssued()) {
            System.out.println("Book already issued.");
        } else {
            b.issue();
            System.out.println("Book issued successfully.");
        }
    }

    public void returnBook(int id) {
        Book b = findBook(id);
        if (b == null) {
            System.out.println("Book not found!");
        } else if (!b.isIssued()) {
            System.out.println("This book was not issued.");
        } else {
            b.returned();
            System.out.println("Book returned successfully.");
        }
    }
}

    

