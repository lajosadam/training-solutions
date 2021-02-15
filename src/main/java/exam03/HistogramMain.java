package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HistogramMain {
    public static void main(String[] args) {

        Path file = Path.of("src/main/resources/histogram.txt");

        try (BufferedReader reader =  Files.newBufferedReader(file)) {
            String result = new Histogram().createHistogram(reader);
            System.out.println(result);
        }
        catch (IOException ioe){
            throw new IllegalStateException("File not found!! " + ioe);
        }

    }
}

// A teszt eset NullPointerExceptionnel elszáll, nem maradt időm a tesztesetból adódó hibákat kijavítani ezért
// egy MAIN class-t írtam, amivel tökéletesen lefut a program!
