import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;

public class ProgrammingProject_2_4 {
    private static int WindowWidth;
    private static int WindowHeight;

    public static void setWindow(int width, int height)
    {
        WindowHeight = height;
        WindowWidth = width;
    }
    public static int getWidth()
    {
        return WindowWidth;
    }
    public static int getHeight()
    {
        return WindowWidth;
    }
    public static void main(String[] args) {

        // TODO: Create and configure a JFrame object here
        setWindow(250, 250);

        JFrame jf = new JFrame("Rect Intersect");
        jf.setSize(getWidth(), getHeight());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // TODO: Add a IntersectionDrawer object to the JFrame (see the nested class definition below)

        IntersectionDrawer ID = new IntersectionDrawer();
        jf.add(ID);
        jf.setVisible(true);

    }

    private static class IntersectionDrawer extends JComponent {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g; // Cast the Graphics parameter into a Graphics2D object


            // TODO: Add code here that draws 2 rectangles AND highlights their intersection
            //our 2 rectangles to draw
            Rectangle r1 = new Rectangle(20, 20, 50, 100);
            Rectangle r2 = new Rectangle(20 + 25, 20 + 50, 50, 100);
            Rectangle r3; //The rectangle we'll define once we find the intersection between
                          //the two other rectangles

            //check the sides of the rectangles if they're intersecting and find the x, y, width, and height of the
            //intersection
            /**
             * What we need to check
             * 1. the top-left corner of r1 and r2
             * 2. the bottom-right corner of r1 and r2
             *
             * If any corner of either rectangle, whichever is greater, is within the bounds of the other
             * rectangle, store the difference between the two points
             *
             * the corners are:
             * Top-left     -> (x, y)
             * Top-right    -> (x+width, y)
             * Bottom-left  -> (x, y+height)
             * Bottom-right -> (x+width, y+height)
             *
             * Note to self -> Don't try to store the corners in an array of points, they're already stored in
             * the rectangles!
             *
             * Another note to self, there's no need to over-engineer your own code, it's not a very good idea!
             **/
            //actually doing the bounds of r3 now!
            r3 = new Rectangle();
            if (r2.x < r1.x + r1.width && r2.y < r1.y + r1.height)
            {
                r3.x = r2.x;
                r3.y = r2.y;
                r3.width = (r1.x + r1.width) - r2.x;
                r3.height = (r1.y + r1.height) - r2.y;
            }

            g2.draw(r1);
            g2.draw(r2);


            //Fill in r3, our intersection rectangle
            g2.fill(r3);
            g2.draw(r3);

        }
    }
}
