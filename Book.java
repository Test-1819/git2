
public class Book {
    int bookId;
    String bookName;
    String author;

    public void displayBook() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book b = new Book();

        b.bookId = 101;
        b.bookName = "Java Programming";
        b.author = "James Gosling";

        b.displayBook();
    }
}
