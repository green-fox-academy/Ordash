import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int box = WIDTH/8;
        int x = 0;
        int y = 0;
        for (int i = 0; i < 8; i++) {

            if (i%2 == 0) {

                for (int j = 0; j < 4 ; j++) {
                    graphics.fillRect(x,y,box,box);
                    x += 2*box; }

            } else {

                x += box;
                for (int k = 0; k < 4; k++) {
                    graphics.fillRect(x,y,box,box);
                    x += 2*box;
                }


            }
            x = 0;
            y += box;


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