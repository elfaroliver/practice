package Bokasafn;

import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public boolean addBook(Book book) {
    return books.add(book);
  }

  public boolean removeBook(String ISBN) {
    for (Book book : books ) {
      if (book.getISBN().equals(ISBN)) {
        if (book.getIsCheckedOut()) {
          System.out.println("Book cannot be removed because it is currently checked out");
          return false;
        }
        books.remove(book);
        return true;
      }
    }
    System.out.println("Book with ISBN " + ISBN + "not found");
    return false;
  }

  public Book searchByTitle(String title) {
    for (Book book : books) {
      if (book.getTitle().equalsIgnoreCase(title)) {
        return book;
      }
    }
    return null;
  }

  public Book searchByISBN(String ISBN) {
    for (Book book : books) {
      if (book.getISBN().equalsIgnoreCase(ISBN)) {
        return book;
      }
    }
    return null;
  }

  public void listBooks() {
    if (books.isEmpty()) {
      System.out.println("No books available in the library");
    } else {
      for (Book book : books) {
        System.out.println(book.toString());
      }
    }
  }

  public boolean borrowBook(String ISBN) {
    for (Book book : books ) {
      if (book.getISBN().equals(ISBN)) {
        if (book.getIsCheckedOut()) {
          System.out.println("Book is already checked out");
          return false;
        }
        book.setCheckedOut(true);
        System.out.println("You have borrowed: " + book.getTitle());
      }
    }
    System.out.println("Book with ISBN " + ISBN + "not found");
    return false;
  }

  public boolean returnBook(String ISBN) {
    for (Book book : books) {
      if (book.getISBN().equals(ISBN)) {
        if (book.getIsCheckedOut()) {
          book.setCheckedOut(false);  // Book is now returned
          System.out.println("Book with ISBN " + ISBN + " has been returned.");
          return true;
        } else {
          System.out.println("This book was not checked out.");
          return false;
        }
      }
    }
    System.out.println("Book with ISBN " + ISBN + " not found.");
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
