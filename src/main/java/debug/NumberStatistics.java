package debug;

import java.util.ArrayList;
import java.util.List;

public class NumberStatistics {

    private List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,11));

    public int sumPositives() {
        int sum = 0;
        for(int n: numbers) {
            if(n != 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for(int i = 1; i < numbers.size() - 1; i++) {
            int actDifference = numbers.get(i) - numbers.get(i + 1);
            if(actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }
}
