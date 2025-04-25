public class Box {
    // Зазначено модифікатор private тому, що змінна доступна лише всередині класу Box
    private int length;

    // Зазначено модифікатор public тому, що цю змінну можна вільно використовувати ззовні класу
    public double capacity;

    // Зазначено модифікатор protected тому, що змінна має бути доступна у спадкоємцях і в одному пакеті
    protected char colorChar;

    // Зазначено модифікатор private тому, що ця змінна — внутрішня інформація класу, не повинна бути доступною ззовні
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

    public static int methodName() {
        int result = 1;
        return result;
    }
}
