public class BasicPrinter implements Machine, Printable {
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}
