public class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int speed, char category, int batteryLevel) {
        super(brand, speed, category);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electric Car | Battery Level: " + batteryLevel + "%");
    }
}
