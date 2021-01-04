package staticInterface;

import java.util.List;
import java.util.stream.Collectors;

public class ValuedClass implements Valued {

    private List<Integer> List;

    public ValuedClass(List<Integer>  List) {
        this.List = List;
    }

    @Override
    public Integer getValue() {
        return  List.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }
}
