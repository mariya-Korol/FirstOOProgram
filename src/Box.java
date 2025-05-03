public class Box {
    private int length;
    public double capacity;
    protected char colorChar;
    private String string;

    public Box(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

    public void createBox(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

    // 🔁 Статичний метод (перевантажений) — приклад статичного поліморфізму

    public static int methodName() {
        return 1;
    }

    public static int methodName(int multiplier) {
        return 1 * multiplier;
    }

    public static double methodName(double a, double b) {
        return a + b;
    }

    public static String methodName(String label, int value) {
        return label + ": " + value;
    }
}
