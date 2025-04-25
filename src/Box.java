public class Box {
    private int length;
    public double capacity;
    protected char colorChar;

    String string;

    public void createBox(int length, double capacity, char colorChar){
        this.length = length;
        this.capacity = capacity;
        this.colorChar = colorChar;
    }

    public static int methodName(){
        int result = 1;

        return result;
    }
}
