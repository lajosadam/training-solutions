package controlselection;

import java.time.LocalTime;

public class Greetings {

    public void greeting(LocalTime time){

        LocalTime firstCondition = LocalTime.of(5, 00);
        LocalTime secondCondition = LocalTime.of(9, 00);
        LocalTime thirdCondition = LocalTime.of(18, 30);
        LocalTime fourthCondition = LocalTime.of(20, 00);


        if (time.isAfter(firstCondition) && time.isBefore(secondCondition)){
            System.out.println("Jó reggelt");
        }else if (time.isAfter(secondCondition) && time.isBefore(thirdCondition)){
            System.out.println("Jó napot!");
        }else if (time.isAfter(thirdCondition) && time.isBefore(fourthCondition)){
            System.out.println("Jó estét!");
        }else {
            System.out.println("Jó éjszakát");
        }

    }


    public static void main(String[] args) {


        LocalTime time1 = LocalTime.of(4, 12);
        LocalTime time2 = LocalTime.of(5, 12);
        LocalTime time3 = LocalTime.of(10, 00);
        LocalTime time4 = LocalTime.of(19, 00);
        LocalTime time5 = LocalTime.of(3, 10);

        Greetings greetings = new Greetings();

        greetings.greeting(time1);
        greetings.greeting(time2);
        greetings.greeting(time3);
        greetings.greeting(time4);
        greetings.greeting(time5);

    }
}
