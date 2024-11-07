public class Main {
    public static void main(String[] args) {

        Author joann = new Author("Joann", "Rowling");
        Author leo = new Author("Leo", "Tolstoy");

        Book book1 = new Book("Harry Potter", joann,1997);
        Book book2 = new Book("War and Peace", leo, 1867);

        System.out.println("Год издания книги " + book1.getBookTitle() + " до изменения даты: " + book1.getPublicationYear());

        book1.setPublicationYear(2005);

        System.out.println("Год издания книги " + book1.getBookTitle() + " после изменения даты: " + book1.getPublicationYear());

        String s = joann.toString();
        String s1 = book1.toString();
        System.out.println("\n---Проверка toString объекта Author---\n" + s + "\n");

        System.out.println("\n---Проверка toString объекта Book---\n" + s1 + "\n");


    }
}