package collectionslist;

import java.util.*;

public class Lotto {

    private final List<Integer> lotto5 = new ArrayList<>();
    private final List<Integer> lotto6 = new ArrayList<>();
    private final List<Integer> lotto7 = new ArrayList<>();
    private List<Integer> nyeroSzamok = new ArrayList<>();

    {
        for (int i=1; i<91; i++){
            lotto5.add(i);
        }
    }
    {
        for (int i=1; i<46; i++){
            lotto6.add(i);
        }
    }
    {
        for (int i=1; i<36; i++){
            lotto7.add(i);
        }
    }

    public void sorsolas(int lotteryType, List<Integer> userNumbers){

        Random winningNumbers = new Random();
        switch (lotteryType){

            case 5:
                nyeroSzamok.clear();
                for (int i=0; i<5; i++){
                    nyeroSzamok.add(winningNumbers.nextInt(35)+1);
                }
                break;

            case 6:
                nyeroSzamok.clear();
                nyeroSzamok.clear();
                for (int i=0; i<6; i++){
                    nyeroSzamok.add(winningNumbers.nextInt(35)+1);
                }
                break;

            case 7:
                nyeroSzamok.clear();
                for (int i=0; i<7; i++){
                    nyeroSzamok.add(winningNumbers.nextInt(35)+1);
                }
                break;
        }
        Collections.sort(nyeroSzamok);
        Collections.sort(userNumbers);
        System.out.println("A nyerőszámok: "+ nyeroSzamok);
        System.out.println("Az Ön számai: "+ userNumbers);
        if (nyeroSzamok.equals(userNumbers)){
            System.out.println("ÖN NYERT!!!!!");
        }else{
            System.out.println("Sajnos nem nyert :(");
        }
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a lottó típusát (5, 6, 7): ");
        int lotteryType = scanner.nextInt();
        scanner.nextLine();

        List<Integer> userNumbers = new ArrayList<>();

        switch (lotteryType){
            case 5:
                for (int i=1; i<6; i++){
                    System.out.println("Kérem a(z) "+i+". nyerőszámot: ");
                    int num1 = scanner.nextInt();
                    if (num1 > 0 && num1 < 91 && !userNumbers.contains(num1)){
                        userNumbers.add(num1);
                    }else{
                        throw new IllegalArgumentException("Nem megfelelő lottószám!!");
                    }
                    scanner.nextLine();
                }
                break;
            case 6:
                for (int i=1; i<7; i++){
                    System.out.println("Kérem a(z) "+i+". nyerőszámot: ");
                    int num1 = scanner.nextInt();
                    if (num1 > 0 && num1 < 46 && !userNumbers.contains(num1)){
                        userNumbers.add(num1);
                    }else{
                        throw new IllegalArgumentException("Nem megfelelő lottószám!!");
                    }
                    scanner.nextLine();
                }
                break;
            case 7:
                for (int i=1; i<8; i++){
                    System.out.println("Kérem a(z) "+i+". nyerőszámot: ");
                    int num1 = scanner.nextInt();
                    if (num1 > 0 && num1 < 36 && !userNumbers.contains(num1)){
                        userNumbers.add(num1);
                    }else{
                        throw new IllegalArgumentException("Nem megfelelő lottószám!!");
                    }
                    scanner.nextLine();
                }
                break;
            default:
                throw new IllegalArgumentException("Nem megfelelő lottótípus");
        }

        lotto.sorsolas(lotteryType, userNumbers);

    }

}
