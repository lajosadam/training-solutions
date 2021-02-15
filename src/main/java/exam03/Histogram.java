package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Histogram {

    public String createHistogram(BufferedReader reader){

        String result = "";

        List<Integer> numberList = new ArrayList<>();

        try (reader) {
            String line;
            while((line = reader.readLine()) != null) {
                numberList.add(Integer.parseInt(line));
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

        for (int numbers : numberList){
            result += convertToStars(numbers);
        }

        return result;
    }

    private String convertToStars(int num) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < num; i++) {
            builder.append('*');
        }
        return builder.toString() + "\n";
    }


}
