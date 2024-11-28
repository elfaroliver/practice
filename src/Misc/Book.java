package Misc;

public class Book {
  private String title;
  private String author;

  public Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String toString() {
    return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            '}';
  }

  public static void main(String[] args) {
    Book myBook = new Book("Elfar Oliver", "Bókin hans");
    System.out.println(myBook);
  }
}
