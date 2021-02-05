package references;

public class ReferencesMain {
    public static void main(String[] args) {

        Person variable1 = new Person("Zolika", 22);

        Person variable2 = variable1;

        variable2.setName("Gergő");

        System.out.println(variable1.getName());
        System.out.println(variable2.getName());

        // mivel referenciát tárolt a 2. változó, ezért az eredeti objektumot változtatta

        int num1 = 24;

        int num2 = num1;
        num2++;

        System.out.println(num1);
        System.out.println(num2);

        //primitív típusú változó, ezért a stacken és nem a heap-en tárolódik
    }
}
