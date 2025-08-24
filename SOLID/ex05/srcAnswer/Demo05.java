public class Demo05 {
    static int areaAfterResize(Shape shape) {
        shape.resize(5, 4); 
        return shape.area();
    }

    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle(0, 0))); 
        System.out.println(areaAfterResize(new Square(0)));       
    }
}
