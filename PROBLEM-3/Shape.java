public class Shape {

    protected String name;

    public Shape(String name) 
    {
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() 
    {
        return "Shape(" + name + "Area: " + area() + ", Perimeter: " + perimeter() + ")";
    }
}
