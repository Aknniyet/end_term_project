public interface BookDetails {
    String getDetails();
}

// Класс для представления жанра Fiction
class FictionBook extends Book implements BookDetails {
    public FictionBook(String title, Author author) {
        super(title, author, "Fiction");
    }

    @Override
    public String getDetails() {
        return "Title: " + getTitle() + ", Author: " + getAuthor().getName() + ", Genre: " + getGenre();
    }
}
