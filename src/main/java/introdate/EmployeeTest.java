package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét: ");
        String name = scanner.nextLine();
        System.out.println("Adja meg a születési dátumát (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateOfBirth);
        System.out.println("Adja meg a belépés időpontját(YYYY-MM-DDTHH:MM:SS): ");
        String beginEmployment = scanner.nextLine();
        LocalDateTime date2 = LocalDateTime.parse(beginEmployment);

        Employee employee = new Employee(name, date, date2);

        System.out.println(employee.getName());
        System.out.println(employee.getDateOfBirth());
        System.out.println(employee.getBeginEmployment());

    }
}
