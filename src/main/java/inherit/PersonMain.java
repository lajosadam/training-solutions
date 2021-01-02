package inherit;

import book.Library;

public class PersonMain {

    public static void main(String[] args) {

        Boss fonok = new Boss("Főnök","Nincs címem");
        Employee csicska = new Employee("Csicska Pista","Nincs címem");

        fonok.setSalary(500000);
        csicska.setSalary(120000);

        fonok.raiseSalary(1.2);
        csicska.raiseSalary(1.2);

        System.out.println("F: "+ fonok.getSalary());
        System.out.println("CS: " + csicska.getSalary());

    }
}
