
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.

        int xmin = 50;
        int xmax = 250;
        int ymin = 50;
        int ymax = 250;

        int x = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        line(x, y, graphics);

        int x1 = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y1 = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        line(x1, y1, graphics);

        int x2 = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y2 = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        line(x2, y2, graphics);





    }
    public static void line(int input1, int input2,Graphics input) {


        input.setColor(Color.RED);
        for (int i = 0; i < 3 ; i++) {

            input.drawLine(input1, input2, 160, 160);


        }



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}