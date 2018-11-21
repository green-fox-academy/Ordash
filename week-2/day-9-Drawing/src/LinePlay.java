import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){

        int range = WIDTH/14;
        int x1 = 0;
        int y1 = 0;
        int x2 = WIDTH;
        int y2 = range;
        int x3 = 0;
        int y3 = 0;
        int x4 = range;
        int y4 = WIDTH;



        graphics.setColor(Color.MAGENTA);
        for (int i = range; i < WIDTH; i+=range) {
            graphics.drawLine(x1,y1,x2,y2);
            x1 = i;
            y2 = i+range;

        }

        graphics.setColor(Color.GREEN);
        for (int j = range; j < WIDTH; j+=range) {
            graphics.drawLine(x3,y3,x4,y4);
            y3 = j;
            x4 = j+range;
        }



    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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