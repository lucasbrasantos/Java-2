package lesson12.abstractClass;

public class GasCar extends Car {
    private int fuelLevel;

    public GasCar(String make, String model, int year, int fuelLevel) {
        super(make, model, year);
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void addFuel(int amount) {
        fuelLevel += amount;
        System.out.println("Fuel added: " + amount + "L, total fuel level: " + fuelLevel + "L");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling gas car...");
        addFuel(10); // Example amount
    }

    @Override
    public String toString() {
        return super.toString() + ", GasCar [fuelLevel=" + fuelLevel + "]";
    }

    public static void main(String[] args) {
        GasCar ford = new GasCar("Ford", "Mustang", 2020, 50);
        System.out.println(ford);
        ford.refuel();
        System.out.println(ford);
    }
}
