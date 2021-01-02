package constructorInheritance;

public class Jeep extends Car{
    private final double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    @Override
    public void drive(int km) {
        if (extraFuel > 0) {
            extraFuel -= (getFuelRate() / 100) * km;
            modifyFuelAmount(extraFuel);
            super.drive(km);
        }
    }

    @Override
    public boolean calculateEnoughFuel() {
        return super.calculateEnoughFuel();
    }

    @Override
    public double calculateRefillAmount() {
        return super.calculateRefillAmount() + (extraCapacity - extraFuel);
    }
}
