package stringmethods;

import java.util.Locale;

public class FileNameManipulator {

    public char findLastCharacter(String word){
        int length = word.length();
        return word.charAt(length-1);
    }

    public String findFileExtension(String file){
        return file.substring(file.indexOf("."));
    }

    public boolean identifyFilesByExtension(String file, String extension){
        if (file.substring(file.indexOf(".")+1).equals(extension)){
            return true;
        }
        return false;
    }

    public String changeExtensionToLowerCase(String file){
        return file.substring(file.indexOf(".")+1).toLowerCase();
    }

    public static void main(String[] args) {

        FileNameManipulator manipulator = new FileNameManipulator();

        char lastCharacter = manipulator.findLastCharacter("Zolika");
        System.out.println(lastCharacter);

        String extension = manipulator.findFileExtension("file.txt");
        System.out.println(extension);

        boolean identify = manipulator.identifyFilesByExtension("Java.PDF", "PDF");
        System.out.println(identify);

        String lowerCase = manipulator.changeExtensionToLowerCase("Java.PDF");
        System.out.println(lowerCase);

    }

}
