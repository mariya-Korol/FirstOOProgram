public class Sneakers extends Shoe {
    private boolean hasLaces;

    public Sneakers(int size, String color, String brand, boolean hasLaces) {
        super(size, color, brand);
        this.hasLaces = hasLaces;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sneakers with laces: " + (hasLaces ? "Yes" : "No"));
        super.displayInfo();
    }
}
