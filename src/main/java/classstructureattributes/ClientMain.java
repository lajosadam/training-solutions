package classstructureattributes;

import java.util.Scanner;

public class ClientMain{
    public static void main(String[]args){
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nevét: ");
        client.name = scanner.nextLine();

        System.out.println("Adja meg a születési évét: ");
        client.year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Adja meg a címét: ");
        client.adress = scanner.nextLine();

        System.out.println("Az ön neve: " + client.name + "Születési éve: " + client.year + "Címe: " + client.adress);

    }
}