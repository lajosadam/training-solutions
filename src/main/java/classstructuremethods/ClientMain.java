package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client();
        client.setName("John Doe");
        client.setYear(1987);
        client.setAdress("6726 Szeged Csíz utca 7/1.");

        System.out.println("Név: "+client.getName()+", Születési év: "+client.getYear()+", Cím: "+client.getAdress());

        client.migrate("6794 Üllés Árpád dűlő 58.");
        System.out.println("Módosított adatok: Név: "+client.getName()+", Születési év: "+client.getYear()+", Cím: "+client.getAdress());

    }
}
