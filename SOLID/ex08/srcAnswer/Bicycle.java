public class Bicycle implements Vehicle, Pedalble {
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}