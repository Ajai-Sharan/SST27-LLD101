public class ConsoleLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

    @Override
    public void report() {
        System.out.println("Report contents...");
    }
    
}