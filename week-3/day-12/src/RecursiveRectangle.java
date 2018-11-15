import javax.swing.*;

import java.awt.*;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RecursiveRectangle {
    public static void mainDraw(Graphics graphics) {

        int width = WIDTH / 3;
        int levels = 5;
        int x0 = 0;
        int y0 = 0;
        graphics.drawRect(x0 ,y0 , WIDTH, HEIGHT);
        drawRecursiveRectangle(graphics, width, x0, y0, levels);
    }

    public static void drawRecursiveRectangle(Graphics graphics, int width,int x0, int y0, int levels) {

        if (levels == 0) {
            return;
        } else {
            for (int i = 0; i < 3; i++) { // y
                for (int j = 0; j < 3; j++) { // x
                        graphics.drawRect(x0 + (j * width),y0 + (i * width), width, width);
                    if ((i+j) % 2 != 0) {
                        drawRecursiveRectangle(graphics, width/3, x0 + j * width, y0 + i * width,levels-1);

                    }
                }
            }
        }
    }

    static int WIDTH = 729;
    static int HEIGHT = 729;

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
            setBackground(Color.YELLOW);
            mainDraw(graphics);
        }
    }
}