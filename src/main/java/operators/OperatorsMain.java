package operators;

public class OperatorsMain {

    public static void main(String[] args) {

        ParosSzam obj = new ParosSzam();

        boolean paratlan = obj.isEven(11);
        boolean paros = obj.isEven(22);

        System.out.println(paros + " és " + paratlan);

    }

}
