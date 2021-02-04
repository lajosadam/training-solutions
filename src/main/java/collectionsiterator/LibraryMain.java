package collectionsiterator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LibraryMain {

    public static void main(String[] args) {

        Book book1 = new Book(1235, "LOTRO", "TOLKIEN");
        Book book2 = new Book(3358, "TT", "TOLKIEN");
        Book book3 = new Book(1198, "GOT", "MARTIN");

        List<Book> lista = new ArrayList<>();
        lista.add(book1);
        lista.add(book2);
        lista.add(book3);

        LibraryManager libraryManager = new LibraryManager(lista);

        System.out.println(libraryManager.selectBooksByAuthor("MARTIN"));
        System.out.println(libraryManager.findBookByRegNumber(3358));
        libraryManager.removeBookByRegNumber(3358);
        System.out.println(libraryManager.getLibraryBooks());



    }

}
