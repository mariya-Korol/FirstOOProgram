public class SimpleService implements Service {
    @Override
    public void process(String request) {
        System.out.println("Processing: " + request);
    }
}

