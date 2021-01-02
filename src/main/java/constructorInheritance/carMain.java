package constructorInheritance;

public class carMain {
    public static void main(String[] args) {

        double carFuelRate = 5.5d;
        double carFuel = 50;
        double carTankCapacity = 85;
        double carExtraCapacity = 100;
        double carExtraFuel = 50;

        int km = 1000;

        Car jeep = new Jeep(carFuelRate, carFuel, carTankCapacity, carExtraCapacity, carExtraFuel);
        jeep.drive(km);
        System.out.println("A Tank kapacitása: " + carTankCapacity + " Liter");
        System.out.println("Extra kapacitás: " + carExtraCapacity + " Liter");
        System.out.println("Összes kapacitás: " + (carExtraCapacity + carTankCapacity) + " Liter");
        System.out.println("Átlag fogyasztás: " + carFuelRate + " Liter");
        System.out.println("Megtett km: " + km + " km");
        System.out.println("Tankolni lehet még: " + jeep.calculateRefillAmount() + " Litert");

    }
}
