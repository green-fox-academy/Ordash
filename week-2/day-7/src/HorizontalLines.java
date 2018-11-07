import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.

        int xmin = 50;
        int xmax = 250;
        int ymin = 50;
        int ymax = 250;

        graphics.setColor(Color.GREEN);
        int x = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        lineDrawing(x, y, graphics);

        graphics.setColor(Color.ORANGE);
        int x1 = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y1 = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        lineDrawing(x1, y1, graphics);

        graphics.setColor(Color.RED);
        int x2 = xmin + (int)(Math.random() * ((xmax - xmin)+1));
        int y2 = ymin + (int)(Math.random() * ((ymax - ymin)+1));
        lineDrawing(x2, y2, graphics);




    }

    public static void lineDrawing(int input1, int input2, Graphics input) {


        for (int i = 0; i < 3 ; i++) {
            input.drawLine(input1, input2, input1 + 50, input2);

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
