public class Shoe {
    private int size;
    private String color;
    private String brand;

    public Shoe(int size, String color, String brand) {
        setSize(size); // використовуємо сетер з перевіркою
        this.color = color;
        this.brand = brand;
    }

    // Геттер для size
    public int getSize() {
        return size;
    }

    // Сетер з контролем значення
    public void setSize(int size) {
        if (size >= 30 && size <= 50) {
            this.size = size;
        } else {
            System.out.println("Invalid shoe size. Must be between 30 and 50.");
        }
    }

    // Геттер і сетер для color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Геттер і сетер для brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Метод для виводу інформації
    public void displayInfo() {
        System.out.println("Shoe: " + brand + ", Size: " + size + ", Color: " + color);
    }
}
