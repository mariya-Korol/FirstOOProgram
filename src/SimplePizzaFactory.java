public class SimplePizzaFactory {
    public Product createPizza(String type) {
        switch (type.toLowerCase()) {
            case "cheese":
                return new CheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
    }
}
