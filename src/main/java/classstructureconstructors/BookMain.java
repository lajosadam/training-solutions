package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("J.R.R. Tolkien", "Lord of the Rings");
        book.register("#1218");
        System.out.println("Author: " + book.getAuthor() + " - " + book.getTitle() + ", Reg number: " + book.getRegNumber());
    }
}
