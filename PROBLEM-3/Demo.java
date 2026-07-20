public class Demo {
    
    public static void main(String[] args) {
        
        Shape[] shapes = {

            new Circle(5),

            new Ellipse(8, 4),

            new Triangle(3, 4, 5),

            new Ellipse(6);

        };

        for(Shape s : shapes) {
            System.out.println(s);
            System.out.println("----------------");
        }
    }
}
