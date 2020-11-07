package array;

public class ArrayHandler {
    boolean contains(int[] source, int itemToFind){
        boolean returnStatement = false;
        for (int i=0; i<source.length; i++){
            if (source[i]==itemToFind){
                returnStatement = true;
            }
        }
        return returnStatement;
    }
}
