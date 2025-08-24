public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) { this.side = side; }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public void resize(int side, int ignored) {
        this.side = side; // only one dimension matters
    }
}
