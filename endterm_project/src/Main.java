public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Agatha Christie");
        Author author2 = new Author(" Walter Isaacson");

        // Создаем различные типы книг
        FictionBook fictionBook = new FictionBook("Death on the Nile", author1);
        NonFictionBook nonFictionBook = new NonFictionBook("Steve Jobs", author2);

        // Создаем библиотеку
        Library library = new Library();

        // Добавляем книги в библиотеку
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);

        // Отображаем список книг в библиотеке
        library.displayBooks();
    }
}
