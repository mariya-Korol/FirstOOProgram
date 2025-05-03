public class Box implements Nameble, Describable {
    private int length;
    public double capacity;
    protected char colorChar;
    private String string;
    private String className;

    public Box(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
        this.className = "Box";
    }

    public void createBox(int length, double capacity, char colorChar) {
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

    //Статичний метод (перевантажений) — приклад статичного поліморфізму

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

    // Реалізація Nameble
    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    // Реалізація Describable
    @Override
    public void describe() {
        System.out.println("Box: length = " + length + ", capacity = " + capacity + ", color = " + colorChar);
    }
}
