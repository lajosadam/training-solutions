package staticInterface;

import java.util.List;

public interface Valued{

    Integer getValue();

    static Valued sum(List<Valued> values){
       Valued finalV = null;
        for(Valued v: values) finalV = v;
        return finalV;
    }
}
