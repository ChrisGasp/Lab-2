import javax.swing.*;
import java.awt.*;
import java.awt.Rectangle.*;
import javax.swing.JComponent.*;
import java.awt.Graphics.*;
import java.awt.Graphics2D.*;

public class PracticeExercise_2_21 {

    public static void main(String[] args)
    {
        // TODO: Create and configure a JFrame object here
        JFrame jf = new JFrame();
        // TODO: Add a NameComponent object to the JFrame (see the nested class definition below)
        // TODO: Show a frame
        jf.setSize(200, 100);
        jf.setTitle("Window");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent pc = new NameComponent();
        jf.add(pc);
        jf.setVisible(true);
    }

    private static class NameComponent extends JComponent
    {
        public void paintComponent(Graphics g)
        {
            Graphics2D g2 = (Graphics2D) g;  // Cast the Graphics parameter into a Graphics2D object

            // TODO: Add code that that draws the name and rectangle as per the exercise instructions
            Color c = new Color(0, 0, 255);
            Rectangle R1 = new Rectangle(25, 15, 130, 25);

            g2.setColor(c);
            g2.draw(R1);

            c = new Color(255, 128, 128);
            g2.setColor(c);
            g2.drawString("Christopher Gasparelli", R1.x + 3, R1.y + 15);

        }
    }
    //private static class NameViewer
}
