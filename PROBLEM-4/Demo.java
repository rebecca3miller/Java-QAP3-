public class Demo {

    // Static method
    public static void scaleShapes(Scalable[] shapes, double factor) {

        for(Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
    
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

        // Call static method
        scaleShapes(shapes, 2);

        System.out.println("After Scaling:");
        for(Shape shape : shapes) {
            System.err.println(shape);
            System.out.println("----------------");
        }
    }
}
