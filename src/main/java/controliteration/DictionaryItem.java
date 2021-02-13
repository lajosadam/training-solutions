package controliteration;

import java.util.ArrayList;
import java.util.List;

public class DictionaryItem {

    private String word;

    private List<String> translations = new ArrayList<>();

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        addTranslations(translations);
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public void addTranslations(List<String> wordsList) {
        for (String words : wordsList){
            if (!translations.contains(words)){
                translations.add(words);
            }else {
                System.out.println("Már van ilyen!");
            }
        }
    }
/*
    public List<String> addItem(String word){
        List<String> itemList = new ArrayList<>();

        //nem értem a feladat leírását

        return  itemList;
    }

    public List<String> findTranslations(String word){
        List<String> translatedWord = new ArrayList<>();



        return translatedWord;
    }

 */
}
