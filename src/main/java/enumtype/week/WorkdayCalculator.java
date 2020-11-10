package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    List<DayType> dayTypes(Day firstDay){

        List<DayType> dayType = new ArrayList<>();

        switch (firstDay){
            case SATURDAY:
            case SUNDAY:
                dayType.add(DayType.HOLIDAY);
                break;
            default:
                dayType.add(DayType.WORKDAY);
        }
        System.out.println(nextDay(firstDay));
        return dayType;
    }

    private Day nextDay(Day day){
        Day nextDay;
        switch (day){
            case MONDAY:
                nextDay = Day.TUESDAY;
                break;
            case TUESDAY:
                nextDay = Day.WEDNESDAY;
                break;
            case WEDNESDAY:
                nextDay = Day.THURSDAY;
                break;
            case THURSDAY:
                nextDay = Day.FRIDAY;
                break;
            case FRIDAY:
                nextDay = Day.SATURDAY;
                break;
            case SATURDAY:
                nextDay = Day.SUNDAY;
                break;
            default:
                nextDay = Day.MONDAY;
        }
        return nextDay;
    }

}
