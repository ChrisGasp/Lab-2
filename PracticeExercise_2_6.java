import java.awt.*;
public class PracticeExercise_2_6
{
    //Though the exercise said 'add another program called addTester', I just added an
    //addTester method to the program in the IDE.
    public static void addTester(int expectedX, int expectedY, Rectangle r)
    {
        System.out.println("Expected X and Y positions:\t("+expectedX+", "+expectedY+")");
        System.out.println("Actual X and Y positions:\t("+r.x+", "+r.y+")");
        System.out.println("Width and Height: " + "\t\t\t("+r.width+", "+r.height+")");
    }
    public static void main(String[] args)
    {

        Rectangle r = new Rectangle(5, 10, 20, 30);

        System.out.println("Position before r.add is used: ("+r.x+", "+r.y+")\n");

        r.add(0, 0);
        addTester(0, 0, r);

    }
}
