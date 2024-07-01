package lesson12.abstractClass;

public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String make, String model, int year, int batteryLevel) {
        super(make, model, year);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        System.out.println("Battery charged to: " + batteryLevel + "%");
    }

    @Override
    public void refuel() {
        System.out.println("Charging electric car...");
        chargeBattery(20); // Example amount
    }

    @Override
    public String toString() {
        return super.toString() + ", ElectricCar [batteryLevel=" + batteryLevel + "]";
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2022, 80);
        System.out.println(tesla);
        tesla.refuel();
        System.out.println(tesla);
    }
}
