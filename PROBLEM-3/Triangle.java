public class Triangle extends Shape {

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double s1, double s2, double s3) 
    {
        super("Triangle");

        if(s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            System.out.println("Invalid Triangle");
            System.exit(0);
        }

        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    @Override
    public double area() 
    {
        double s = perimeter() / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

    }

    @Override
    public double perimeter()
    {
        return side1 + side2 + side3;
    }

}
