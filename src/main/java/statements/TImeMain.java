package statements;

import java.util.Scanner;

public class TImeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem adja meg az első időpont óráját: ");
        int hour1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem adja meg az első időpont percét: ");
        int minute1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem adja meg az első időpont másodpercét: ");
        int second1 = scanner.nextInt();
        scanner.nextLine();

        Time time1 = new Time(hour1, minute1, second1);

        System.out.println("Az első időpont: "+hour1+":"+minute1+":"+second1+" "+time1.getInMinutes()+" perc");
        System.out.println("Az első időpont: "+hour1+":"+minute1+":"+second1+" "+time1.getInSeconds()+" másodperc");

        System.out.println("Kérem adja meg az második időpont óráját: ");
        int hour2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem adja meg az második időpont percét: ");
        int minute2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem adja meg az második időpont másodpercét: ");
        int second2 = scanner.nextInt();
        scanner.nextLine();

        Time time2 = new Time(hour2, minute2, second2);

        System.out.println("Az első időpont: "+hour2+":"+minute2+":"+second2+" "+time2.getInMinutes()+" perc");
        System.out.println("Az első időpont: "+hour2+":"+minute2+":"+second2+" "+time2.getInSeconds()+" másodperc");

        System.out.println(time1.earlierThan(time2));

    }
}
