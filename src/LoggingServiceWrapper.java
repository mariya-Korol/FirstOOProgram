public class LoggingServiceWrapper extends AbstractServiceWrapper {

    public LoggingServiceWrapper(Service wrappedService) {
        super(wrappedService);
    }

    @Override
    public void process(String request) {
        System.out.println("[LOG] Start: " + request);
        wrappedService.process(request);
        System.out.println("[LOG] End");
    }
}