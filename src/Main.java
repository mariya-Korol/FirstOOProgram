public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10, 5.5, 'R');
        Box box2 = new Box(20, 7.2, 'G');

        Car car1 = new Car("Toyota", 120, 'A');
        Car car2 = new Car("BMW", 180, 'S');

        // Виклик статичної змінної напряму через клас
        System.out.println("Total cars (accessing variable): " + Car.totalCars);

        // Виклик статичного методу
        Car.showTotalCars();
    }
}
