public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public void orderPizza(String type) {
        Product pizza = factory.createPizza(type);
        pizza.prepare();
    }
}
