import java.util.Objects;

public class Book {

    private String bookTitle;
    private Author author;
    private int publicationYear;

    public Book(String bookTitle, Author author, int publicationYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationYear);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Книга: " + bookTitle + "\n" + author.toString() +
                "\nГод публикации: " + publicationYear;
    }
}
