package controliteration;


import java.util.Arrays;
import java.util.List;

public class Dictionary {

    public static void main(String[] args) {

        List<String> kutyaLista = Arrays.asList("dog", "doggy");
        List<String> kutyalista2 = Arrays.asList("dogsy", "doggyka");

        DictionaryItem dictionaryItem = new DictionaryItem("kutya", kutyaLista );

        System.out.println(dictionaryItem.getWord());
        System.out.println(dictionaryItem.getTranslations());
        dictionaryItem.addTranslations(kutyalista2);

        System.out.println(dictionaryItem.getWord());
        System.out.println(dictionaryItem.getTranslations());

    }

}
