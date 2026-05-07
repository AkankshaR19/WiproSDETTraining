package assignment_8;

import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Data Structures");
        Book b3 = new Book("Operating Systems");

        library.put(b1, true);
        library.put(b2, true);
        library.put(b3, true);

        System.out.println("Available books:");
        for (Book b : library.keySet()) {
            if (library.get(b)) {
                System.out.println(b);
            }
        }

        System.out.print("\nEnter book to borrow: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Book b : library.keySet()) {
            if (b.title.equalsIgnoreCase(name)) {
                found = true;
                if (library.get(b)) {
                    library.put(b, false);
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book not available.");
                }
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        sc.close();
    }
}
