import java.util.List;
import java.util.ArrayList;
public class Library {
    private List<BookDetails> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(BookDetails book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (BookDetails book : books) {
            System.out.println(book.getDetails());
        }
    }
}
