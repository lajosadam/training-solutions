package staticInterface;

import java.util.ArrayList;
import java.util.List;

public class ValuedMain {

    public static void main(String[] args) {
        List<Valued> values = new ArrayList<>();
        values.add(new ValuedClass(List.of(1,2,3,4,5)));
        values.add(new ValuedClass(List.of(13,22,1,4,5)));
        System.out.println(Valued.sum(values).getValue());
    }
}
