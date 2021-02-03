package genericsusage;


import java.util.ArrayList;
import java.util.List;

public class Library {

    List listWithoutGenerics = new ArrayList<>();
    List listWithGenerics = new ArrayList();

    public void getFirstBook(){
        if( listWithGenerics == null){
            throw new NullPointerException("Null");
        }else if (listWithGenerics.size() == 0){
            throw new IllegalArgumentException("Üres");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.getFirstBook();
    }
}
