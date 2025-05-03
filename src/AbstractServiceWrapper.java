public abstract class AbstractServiceWrapper implements Service {
    protected final Service wrappedService;

    public AbstractServiceWrapper(Service wrappedService) {
        this.wrappedService = wrappedService;
    }

    @Override
    public abstract void process(String request); // залишаємо реалізацію на спадкоємців
}
