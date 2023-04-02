import java.awt.*;
public class PracticeExercise_2_15
{
    public static void main(String[] args)
    {
        Point p1 = new Point(3,4);
        Point p2 = new Point(-3,-4);

        System.out.println("The position of p1 is: ("+p1.x+", "+p1.y+")");
        System.out.println("The position of p2 is: ("+p2.x+", "+p2.y+")");

        System.out.println("\nThe distance between the two points:");
        System.out.println("Expected distance: 10");
        System.out.println("Actual distance: " + Point.distance(p1.x, p1.y, p2.x, p2.y));

    }
}
