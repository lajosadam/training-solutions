package constructorInheritance;

public class Car {
    private final double fuelRate;
    private double fuel;
    private final double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel -= fuel;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void drive(int km){
            this.fuel -= (fuelRate / 100) * km;
            if (calculateEnoughFuel()) {
                System.out.println("A megtett km: "+km+ " Fennamradó üzemanyag: " + fuel + " Liter");
            } else {
                System.out.println("Nincs elég üzemagyag");
            }
    }

    public double calculateRefillAmount(){
            return tankCapacity-fuel;
    }

    public boolean calculateEnoughFuel(){
            boolean value = false;
            double fuelEatOneKm = fuelRate / 100;
            if (fuel >= fuelEatOneKm){
                value = true;
            }
            return value;
    }
}
