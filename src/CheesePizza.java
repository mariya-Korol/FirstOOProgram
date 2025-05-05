public class CheesePizza implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }
}

public class PepperoniPizza implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni Pizza");
    }
}
