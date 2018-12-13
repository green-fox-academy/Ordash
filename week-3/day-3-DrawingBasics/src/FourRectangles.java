import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int xmin = 50;
        int xmax = 100;
        int ymin = 50;
        int ymax = 100;

        for (int i = 0; i < 4 ; i++) {
            int x = xmin + (int)(Math.random() * ((xmax - xmin)+1));
            int y = ymin + (int)(Math.random() * ((ymax - ymin)+1));
            int x1 = xmin + (int)(Math.random() * ((xmax - xmin)+1));
            int x2 = ymin + (int)(Math.random() * ((ymax - ymin)+1));

            graphics.setColor(new Color(x,y,x1));

            graphics.drawRect(x,y,x1,x2);




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