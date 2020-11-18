package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> listBook = new ArrayList<>();

    public void loadFromFile(){
        try (Scanner scanner = new Scanner(Library.class.getResourceAsStream("/books.csv"))){
            while (scanner.hasNext()){
                Book book = new Book(scanner.useDelimiter(";").next(), scanner.useDelimiter(";").next(), scanner.useDelimiter(";").next(), Integer.parseInt(scanner.next().trim()));
                listBook.add(book);
            }
        }catch (NumberFormatException nfe){
            System.out.println("ERROR: " + nfe);
        }
    }

    public List<Book> getListBook(){
        return listBook;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.loadFromFile();
        System.out.println(library.getListBook().toString());

    }
}
