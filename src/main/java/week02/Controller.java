package week02;

import java.text.ParseException;
import java.util.Scanner;

public class Controller {
    Office office = new Office();

    public void readOffice(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány db tárgyalót szeretne: ");
        int officeNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<officeNumber; i++){
            System.out.println("Kérem a tárgyaló nevét: ");
            String officeName = scanner.nextLine();
            System.out.println("Kérem a tárgyaló hosszát: ");
            int officeLength = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Kérem a tárgyaló szélességét: ");
            int officeWidth = scanner.nextInt();
            scanner.nextLine();
            MeetingRoom meetingRoom = new MeetingRoom(officeName, officeWidth, officeLength);
            office.addMeetingRoom(meetingRoom);
        }
        System.out.println("Tárgyalók db: " + office.meetingRoom.size());
    }

    public void printMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem a menüpont számát: ");
        int menuItem = Integer.parseInt(scanner.nextLine());

        switch (menuItem){
            case 1: office.printNames();
                break;
            case 2:
                office.printNamesReverse();
                break;
            case 3:

                break;
            case 4:
                office.printAreas();
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("NANI???");
                break;
        }

        /**
         1. Tárgyalók sorrendben
         2. Tárgyalók visszafele sorrendben
         3. Minden második tárgyaló
         4. Területek
         5. Keresés pontos név alapján
         6. Keresés névtöredék alapján
         7. Keresés terület alapján
         **/
    }

    public void runMenu(){

    }

    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();

    }
}
