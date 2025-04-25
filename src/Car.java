public class Car {
    private String brand;
    public int speed;
    protected char category;

    String model;

    public Car(String brand, int speed, char category) {
        this.brand = brand;
        this.speed = speed;
        this.category = category;
    }

    public void createCar(String brand, int speed, char category) {
        this.brand = brand;
        this.speed = speed;
        this.category = category;
    }

    public static boolean isMoving() {
        boolean moving = true;
        return moving;
    }
}
