package array;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {

        String hetNapjai[] = {"Hétfő", "Kedd", "Szerda", "Csütörtök", "Péntek", "Szombat", "Vasárnap"};
        System.out.println(hetNapjai[1]);

        int array[] = new int[5];
        array[0]=1;
        for (int i=0; i<array.length; i++){
            array[i] += i*2;
            System.out.println(array[i]);
        }

        boolean arrayBoolean[] = new boolean[6];
        for (int i=0; i<arrayBoolean.length; i++){
            if (i%2>0){
                arrayBoolean[i] = true;
            }
            System.out.println(arrayBoolean[i]);
        }
        System.out.println("______________________________");
        ArrayHandler arrayHandler = new ArrayHandler();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a számot, megnézem benne van-e a tömbben: ");
        int itemToFind = scanner.nextInt();
        scanner.nextLine();
        System.out.println(arrayHandler.contains(array, itemToFind));

    }
}
