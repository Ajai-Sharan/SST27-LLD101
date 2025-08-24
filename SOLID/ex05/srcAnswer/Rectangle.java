public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int area() {
        return width * height;
    }

    @Override
    public void resize(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
