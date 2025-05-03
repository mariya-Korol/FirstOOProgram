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
 
        /* === Практична робота №4 "Code Convention" === */
        // Відповідних помилок не було знайдено. Код написано за є принципами гарного написання коду.


        /* === Практична робота №5 "Реалізація принципу статичного поліморфізму" === */
        // Виклики перевантажених методів
        System.out.println(Box.methodName());                      // → 1
        System.out.println(Box.methodName(5));                     // → 5
        System.out.println(Box.methodName(2.5, 3.5));              // → 6.0
        System.out.println(Box.methodName("Length", 10));         // → Length: 10


        /* === Практична робота №6 "Реалізація патерну типу Singelton - Одинак" === */
        President p1 = President.getInstance("President1");
        p1.showInfo();  // President's name is: President1

        // Спроба створити нового президента
        President p2 = President.getInstance("President2");
        p2.showInfo();  // Все ще: President's name is: President1

        // Перевірка, чи це один і той самий об’єкт
        System.out.println("Same instance? " + (p1 == p2));  // true


        /* === Практична робота №7 "Реалізація принципу Інкапсуляції" === */
        Shoe shoe = new Shoe(42, "Black", "Adidas");
        shoe.displayInfo();

        // Спроба задати некоректний розмір
        shoe.setSize(25); //Invalid shoe size. Must be between 30 and 50.

        // Перегляд значення після невдалої зміни
        System.out.println("Actual size: " + shoe.getSize()); // → 42


        /* === Практична робота №8 "Створення та використання інтерфейсів" === */
        Box box = new Box(10, 5.5, 'R');
        Chair chair = new Chair("Wood", 4, false);

        System.out.println("Box class name: " + box.getClassName());
        System.out.println("Chair class name: " + chair.getClassName());

        box.describe();
        chair.describe();

        /* === Практична робота №9 "Реалізація патерну типу Observer" === */
        BankAccount account = new BankAccount(1000);

        AccountHolder user1 = new AccountHolder("Олександр");
        AccountHolder user2 = new AccountHolder("Марія");

        account.addObserver(user1);
        account.addObserver(user2);

        account.setBalance(1200);  
        account.setBalance(980);   


        /* === Практична робота №10 "Реалізація принципу Спадкування" === */
        Service simple = new SimpleService();

        Service logger = new LoggingServiceWrapper(simple);
        Service secured = new SecurityServiceWrapper(simple);

        System.out.println("\n--- Logging ---");
        logger.process("getUserData");

        System.out.println("\n--- Security ---");
        secured.process("adminOnly_getConfig"); // буде заборонено

        System.out.println("\n--- Security ---");
        secured.process("viewDashboard"); // буде дозволено
    }
}
