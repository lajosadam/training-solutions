package collectionsclass;

import java.util.*;

public class CollectionManager {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book(4321, "LOTRO", "Tolkien"),
                new Book(7654, "GOT", "Martin"),
                new Book(2256, "CUJO", "King")
        ));

        List<Book> fedettLista = Collections.unmodifiableList(bookList);

        System.out.println(bookList);
        System.out.println(fedettLista);

        bookList.add(new Book(1447, "JAVA", "Delta Vision"));

        System.out.println("____________________________");
        System.out.println(fedettLista);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,3,66,92,111));
        Collections.shuffle(numbers, new Random());
        System.out.println("_____________________________");
        System.out.println(numbers);

        List<Integer> numbersAgain = numbers;
        Collections.reverse(numbersAgain);
        System.out.println(numbersAgain);
    }
}
