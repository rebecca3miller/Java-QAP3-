public class Ellipse extends Shape {

    protected double a;
    protected double b;

    public Ellipse(double x, double y) 
    {
        super("Ellipse");

        if(x >= y) {
            a = x;
            b = y;
        } else {
            a = y;
            b = x;
        }
    }

    @Override
    public double area() 
    {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() 
    {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public void scale(double factor)
    {
        a *= factor;
        b *= factor;
    }
}
