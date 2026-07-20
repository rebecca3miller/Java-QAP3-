public class Demo3 {
    
    public static void main(String[] args) {
        
        Shape[] shapes = {

            new Circle(5),

            new Ellipse(8, 4),

            new Triangle(3, 4, 5),

            new EquilateralTriangle(6)

        };

        for(Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("----------------");
        }
    }
}
