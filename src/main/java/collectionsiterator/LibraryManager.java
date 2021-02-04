package collectionsiterator;

import java.util.*;

public class LibraryManager {

    private List<Book> libraryBooks;

    public LibraryManager(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public Book findBookByRegNumber(int regNumber){
        Book book = null;
            for (Book i : libraryBooks){
                if (regNumber == i.getRegNumber()){
                    book = i;
                }
            }
        return book;
    }

    /*
    public void removeBookByRegNumber(int regNumber){
        for (Iterator<Book> i = libraryBooks.iterator(); i.hasNext();){
            if (regNumber == i.next().getRegNumber()){
                libraryBooks.remove(i.next());
            }
        }
    }
*/
    public void removeBookByRegNumber(int regNumber){
        for (Book i : libraryBooks){
            if (regNumber == (i.getRegNumber())){
                libraryBooks.remove(i);
            }
        }
    }

    public Book selectBooksByAuthor(String author){
        Book book = null;
            for (Book i : libraryBooks){
                if (author.equals(i.getAuthor())){
                    book = i;
                }
            }
        return book;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }
}
