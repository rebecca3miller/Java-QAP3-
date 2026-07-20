public class Triangle extends Shape {

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) 
    {
        super("Triangle");

        if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Error: Invalid Triangle.");
            System.exit(0);
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    @Override
    public void scale(double factor)
    {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

}
