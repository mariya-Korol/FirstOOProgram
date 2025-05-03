public class SecurityServiceWrapper extends AbstractServiceWrapper {

    public SecurityServiceWrapper(Service wrappedService) {
        super(wrappedService);
    }

    @Override
    public void process(String request) {
        if (isAuthorized(request)) {
            System.out.println("[SECURITY] Access granted");
            wrappedService.process(request);
        } else {
            System.out.println("[SECURITY] Access denied");
        }
    }

    // Симуляція перевірки доступу
    private boolean isAuthorized(String request) {
        return !request.contains("adminOnly");
    }
}
