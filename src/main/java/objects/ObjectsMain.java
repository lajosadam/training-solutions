package objects;

public class ObjectsMain {
    public static void main(String[] args) {

        Book emptyBook  = new Book();
        System.out.println(emptyBook);
        emptyBook = null;
        System.out.println(emptyBook);

        if (emptyBook == null){
            System.out.println("Empty book is Null!");
        }

        Book book = emptyBook;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

    }
}
