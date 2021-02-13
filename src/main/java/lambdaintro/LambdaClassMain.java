package lambdaintro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaClassMain {

    public static void main(String[] args) {

        List<LambdaClass> lista = Arrays.asList(
                new LambdaClass("Jóska", 1987),
                new LambdaClass("Géza", 1990),
                new LambdaClass("Vinnetou", 1960)
        );

        // LAMBDA verzió:
        Collections.sort(lista, Comparator.comparingInt(lambdaClass -> lambdaClass.getYearOfBirth()));

        System.out.println(lista);

        //METHOD verzió:
        Collections.sort(lista, Comparator.comparing(LambdaClass::getYearOfBirth, Comparator.reverseOrder()));

        System.out.println(lista);

    }

}
