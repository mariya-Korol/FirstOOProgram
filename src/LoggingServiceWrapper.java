public class LoggingServiceWrapper implements Service {
    private final Service wrappedService;

    public LoggingServiceWrapper(Service wrappedService) {
        this.wrappedService = wrappedService;
    }

    @Override
    public void process(String request) {
        System.out.println("[LOG] Method 'process' called with input: " + request);
        wrappedService.process(request);
        System.out.println("[LOG] Method 'process' finished.");
    }
}