public class Chair implements Nameble, Describable {
    private String material;
    private int legs;
    private boolean isFoldable;
    private String className;

    public Chair(String material, int legs, boolean isFoldable) {
        this.material = material;
        this.legs = legs;
        this.isFoldable = isFoldable;
        this.className = "Chair";
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
        System.out.println("Chair: material = " + material + ", legs = " + legs + ", foldable = " + (isFoldable ? "Yes" : "No"));
    }
}
