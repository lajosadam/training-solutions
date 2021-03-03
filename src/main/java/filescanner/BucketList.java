package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class BucketList {

    public static void main(String[] args) {

        Path path = Path.of("src/main/resources/filescanner/BucketList.txt");

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }

        catch (IOException e) {
            System.out.println("Invalid file!! " + e);;
        } ;

    }

}
