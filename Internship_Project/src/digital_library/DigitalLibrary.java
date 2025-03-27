package digital_library;

import java.util.*;

public class DigitalLibrary {
    private static List<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Book\n2. View All Books\n3. Search Book\n4. Update Book\n5. Delete Book\n6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 : addBook(); break;
                case 2 : viewAllBooks(); break;
                case 3 : searchBook(); break;
                case 4 : updateBook(); break;
                case 5 : deleteBook(); break;
                case 6 : 
                	System.out.println("Exiting..."); 
                	System.exit(0); 
                default : System.out.println("Invalid choice!");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String bookID = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                System.out.println("Error: Book ID must be unique.");
                return;
            }
        }

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Availability (Available/Checked Out): ");
        String availability = scanner.nextLine();
        
        if (title.isEmpty() || author.isEmpty() || (!availability.equalsIgnoreCase("Available") && !availability.equalsIgnoreCase("Checked Out"))) {
            System.out.println("Error: Invalid input.");
            return;
        }
        
        books.add(new Book(bookID, title, author, genre, availability));
        System.out.println("Book added successfully.");
    }

    private static void viewAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void searchBook() {
        System.out.print("Enter Book ID or Title to search: ");
        String query = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookID().equalsIgnoreCase(query) || book.getTitle().equalsIgnoreCase(query)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        String bookID = scanner.nextLine();
        for (Book book : books) {
            if (book.getBookID().equals(bookID)) {
                System.out.print("Enter new Title (leave blank to keep unchanged): ");
                String title = scanner.nextLine();
                System.out.print("Enter new Author (leave blank to keep unchanged): ");
                String author = scanner.nextLine();
                System.out.print("Enter new Genre (leave blank to keep unchanged): ");
                String genre = scanner.nextLine();
                System.out.print("Enter new Availability (Available/Checked Out): ");
                String availability = scanner.nextLine();
                
                if (!title.isEmpty()) book.setTitle(title);
                if (!author.isEmpty()) book.setAuthor(author);
                if (!genre.isEmpty()) book.setGenre(genre);
                if (availability.equalsIgnoreCase("Available") || availability.equalsIgnoreCase("Checked Out")) {
                    book.setAvailability(availability);
                }
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String bookID = scanner.nextLine();
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getBookID().equals(bookID)) {
                iterator.remove();
                System.out.println("Book deleted successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
