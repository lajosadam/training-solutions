package stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class Palindroma {

    public List<Character> lista1 = new ArrayList<>();
    public List<Character> lista2 = new ArrayList<>();

    public boolean isPalindrome(String word){

        if (word.equals(null)){
            throw new IllegalArgumentException("Nem megfelelő formátum!");
        }

        StringBuilder whitespace = new StringBuilder(word);
        whitespace.deleteCharAt(whitespace.indexOf(" "));

        while (whitespace.indexOf(" ") != -1){
            whitespace.deleteCharAt(whitespace.indexOf(" "));
        }
        System.out.println(whitespace);

        for (int i=0; i<whitespace.length(); i++){
            lista1.add(whitespace.charAt(i));
            lista2.add(whitespace.reverse().charAt(i));
        }


        if (lista1.equals(lista2)){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        Palindroma palindroma = new Palindroma();

        boolean value = palindroma.isPalindrome("géza kék az ég");
        System.out.println(value);

        System.out.println(palindroma.lista1);
        System.out.println(palindroma.lista2);

    }

}
