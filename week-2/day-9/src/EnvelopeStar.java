import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics) {

        int quarterWidth = WIDTH / 2;
        int numOfLines = 14;
        int range = quarterWidth / numOfLines;
        int x0 = 0;
        int y0 = 0;
        int x1 = quarterWidth;
        int y1 = quarterWidth;

        graphics.setColor(Color.GREEN);


        for (int i = 0; i < quarterWidth-range/2; i += range) {

            graphics.drawLine(x1, y0 + i, x1 - i, y1);

        }
        for (int i = 0; i < quarterWidth-range/2; i += range) {

            graphics.drawLine(x1, y0 + i, x1 + i, y1);

        }
        for (int i = 0; i < quarterWidth-range/2; i += range) {

            graphics.drawLine(x1, (2*y1)-i, x1-i, y1);

        }
        for (int i = 0; i < quarterWidth-range/2; i += range) {

            graphics.drawLine(x1, (2*y1)-i, x1+i, y1);

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

