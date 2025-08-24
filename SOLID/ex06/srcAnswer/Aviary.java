package SOLID.ex06.srcAnswer;

public class Aviary {
    public void release(Flyable b) {
        b.fly();
        System.out.println("Released");
    }
}
