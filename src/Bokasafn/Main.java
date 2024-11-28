package Bokasafn;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("1984", "George Orwell", "12345");
    Book book2 = new Book("To Kill A Mockingbird", "Harper Lee", "23456");
    Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "34567");

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    System.out.println("Listing all books in the library");
    library.listBooks();

    System.out.println("\nSearching for a book by title:");
    Book searchedBookByTitle = library.searchByTitle("1984");
    if (searchedBookByTitle != null) {
      System.out.println("Found: " + searchedBookByTitle);
    } else {
      System.out.println("Book not found.");
    }

    System.out.println("\nSearching for a book byt ISBN:");
    Book searchedBookByISBN = library.searchByISBN("12345");
    if (searchedBookByISBN != null) {
      System.out.println("Found: " + searchedBookByISBN);
    } else {
      System.out.println("Book not found");
    }

    System.out.println("\nAttempting to borrow a book with ISBN 12345:");
    boolean borrowSuccess = library.borrowBook("12345");
    if (borrowSuccess) {
      System.out.println("Book with ISBN 12345" + " checked out");
    } else {
      System.out.println("Book with ISBN 12345" + " not checked out");
    }

    System.out.println("Listing all books in the library");
    library.listBooks();

    System.out.println("\nAttempting to return a book with ISBN 12345:");
    boolean returnSuccess = library.returnBook("12345");
    if (returnSuccess) {
      System.out.println("Book with ISBN 12345" + " checked out");
    } else {
      System.out.println("Book with ISBN 12345" + " not checked out");
    }

    System.out.println("\nListing all books after returning a book:");
    library.listBooks();
  }
}
