public class Car {
    // Зазначено модифікатор private тому, що назва бренду має зберігатися приватно (наприклад, від зміни зовні)
    private String brand;

    // Зазначено модифікатор public тому, що швидкість авто може бути вільно доступна для читання/запису
    public int speed;

    // Зазначено модифікатор protected тому, що категорія доступна в спадкоємцях або в межах пакету
    protected char category;

    // Зазначено модифікатор private тому, що модель авто не повинна змінюватися безпосередньо ззовні
    private String model;

    // Статична змінна — загальна для всіх об'єктів класу
    public static int totalCars = 0;
    public Car(String brand, int speed, char category) {
        this.brand = brand;
        this.speed = speed;
        this.category = category;

        // Кожного разу при створенні об'єкта збільшуємо лічильник
        totalCars++;
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

    // Статичний метод для виведення загальної кількості авто
    public static void showTotalCars() {
        System.out.println("Total cars created: " + totalCars);
    }
}
