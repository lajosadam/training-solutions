package idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    public List<String> ids = new ArrayList<>();

    public void readIdsFromFile(Path input){

        try (BufferedReader reader = Files.newBufferedReader(input)) {
            String line;
            while ((line = reader.readLine()) != null){
                ids.add(line);
            }

        }catch (IOException ioe){

            throw new IllegalStateException("Unable to open file!", ioe);

        }



    }

    public static void main(String[] args) {

        Path file = Path.of("F:\\Training360\\training-solutions\\training-solutions\\src\\main\\resources\\idnumbers.txt");

        IdManager idManager = new IdManager();

        idManager.readIdsFromFile(file);
        System.out.println(idManager.ids);
    }

}
