public class Demo2 {
    public static void main(String[] args) 
    {
        Point p1 = new Point();
        Point p2 = new Point(2.0f, 3.0f);

        System.out.println("Point 1:");
        System.out.println(p1);

        System.out.println();

        System.out.println("Point 2:");
        System.out.println(p2);

        System.out.println();

        MoveablePoint mp1 = new MoveablePoint();
        System.out.println(mp1);

        MoveablePoint mp2 = new MoveablePoint(2.0f, 3.0f, 1.0f, 2.0f);
        System.out.println(mp2);

        System.out.println();

        mp2.move();

        System.out.println("After moving mp2:");
        System.out.println(mp2);
    }

}
