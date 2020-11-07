package arrayofarrays;

import java.util.Scanner;

public class ArrayOfArraysMain {

    public int[][] multiplicationTable(int size){

        int[][] count = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                count[i][j] = (i+1)*(j+1);
            }
        }
        return count;
    }

    public int[][] triangularMatrix(int size){
        int[][] count = new int[size][];
        for (int i=0; i<count.length; i++){
            count[i] = new int[i+1];
            for (int j=0; j<i+1; j++){
                count[i][j] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayOfArraysMain arrayMethod = new ArrayOfArraysMain();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szorzótábla mérete: ");
        int szam = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<szam; i++){
            for (int j=0; j<szam; j++){
                System.out.print(arrayMethod.multiplicationTable(szam)[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("Háromszög mérete: ");
        int szam2 = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<szam2; i++){
            for (int j=0; j<szam2; j++){
                System.out.print(arrayMethod.triangularMatrix(szam)[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
