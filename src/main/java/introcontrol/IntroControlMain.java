package introcontrol;

import java.util.Random;

public class IntroControlMain {
    public static void main(String[] args) {

        IntroControl control = new IntroControl();
        int number = new Random().nextInt(20);

        System.out.println(number);
        System.out.println(control.substractTenIfGreaterThanTen(number));

    }
}
