package Bokasafn;

public class Book {
  private String title;
  private String author;
  private String ISBN;
  private boolean isCheckedOut;

  public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.isCheckedOut = false;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getIsCheckedOut() {
    return isCheckedOut;
  }

  public void setCheckedOut(boolean checkedOut) {
    isCheckedOut = checkedOut;
  }

  public boolean borrow() {
    if (!isCheckedOut) {
      isCheckedOut = true;
      return true;
    } else {
      return false;
    }
  }

  public boolean returnBook() {
    if (isCheckedOut) {
      isCheckedOut = false;
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "Title " + title + "," + "Author " + author + "," + "ISBN " + ISBN + "," + "Borrowed " + isCheckedOut;
  }

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
