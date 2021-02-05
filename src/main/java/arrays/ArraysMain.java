package arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDaysAsString(){
        int[] numberOfDays  = new int[] { 1, 2, 3, 4 };
        return numberOfDays.toString();
    }

    public List<String> daysOfWeek(){
        List<String> dayNames = new ArrayList<>(List.of("Hétfő", "Kedd", "Szerda"));
        return dayNames;
    }

    public String multiplicationTableAsString(int size){
        int[] szorzoTabla  = new int[] { size};
        return Arrays.toString(szorzoTabla);
    }
}
