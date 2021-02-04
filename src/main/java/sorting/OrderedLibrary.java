package sorting;

import java.util.*;

public class OrderedLibrary {
    public static void main(String[] args) {

        List<Book> bookList = Arrays.asList(
                new Book(4321, "LOTRO", "Tolkien"),
                new Book(7654, "GOT", "Martin"),
                new Book(2256, "CUJO", "King")
        );

        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        System.out.println(bookList);
        System.out.println("______________________________________________________________________________________________________");

        Set<Book> bookSet = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRegNumber() - o2.getRegNumber();
            }
        });
        bookSet.add(new Book(4321, "LOTRO", "Tolkien"));
        bookSet.add(new Book(1122, "GOT", "Martin"));
        bookSet.add(new Book(9833, "CUJO", "King"));
        System.out.println(bookSet);
    }
}
