public class Car {
    // Приватне поле — марка авто, доступне лише в межах класу
    private String brand;

    // Публічне поле — швидкість авто, доступна ззовні
    public int speed;

    // Protected поле — категорія авто, доступне в межах пакету та підкласів
    protected char category;

    // Приватне поле — модель авто
    private String model;

    // Статична змінна — спільна для всіх об'єктів класу Car
    public static int totalCars = 0;

    // Конструктор класу Car
    public Car(String brand, int speed, char category) {
        this.brand = brand;
        this.speed = speed;
        this.category = category;
        totalCars++; // Збільшуємо загальний лічильник авто
    }

    // Метод для створення/оновлення даних про авто
    public void createCar(String brand, int speed, char category) {
        this.brand = brand;
        this.speed = speed;
        this.category = category;
    }

    // Статичний метод, який повертає true — умовна перевірка, чи рухається авто
    public static boolean isMoving() {
        return true;
    }

    // Статичний метод для виведення кількості створених авто
    public static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }

    // 🔁 Метод, який можна перевизначити в підкласах — демонстрація поліморфізму
    public void displayInfo() {
        System.out.println("This is a generic car.");
    }
}
