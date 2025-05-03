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


        /* === Практична робота №1 "Реалізація принципу динамічного поліморфізму" === */
        Car genericCar = new Car("Toyota", 120, 'A');
        Car tesla = new ElectricCar("Tesla", 150, 'B', 85); //  Динамічний поліморфізм

        genericCar.displayInfo(); // This is a generic car.
        tesla.displayInfo();      // Electric Car | Battery Level: 85%


         /* === Практична робота №2 "Реалізація патерну типу Wrapper" === */
         Service simple = new SimpleService();
         Service logged = new LoggingServiceWrapper(simple);
 
         logged.process("Get user data");


         /* === Практична робота №3 "Абстрактні класи" === */

         Service service = new LoggingServiceWrapper(new SimpleService());
         service.process("Example request");
    }
}
