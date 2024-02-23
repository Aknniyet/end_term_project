public class NonFictionBook extends Book implements BookDetails {
    public NonFictionBook(String title, Author author) {
        super(title, author, "Non-Fiction");
    }

    @Override
    public String getDetails() {
        return "Title: " + getTitle() + ", Author: " + getAuthor().getName() + ", Genre: " + getGenre();
    }
}

