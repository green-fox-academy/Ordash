import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayArrayListMulti {
    public static void mainDraw(Graphics graphics) {

        ArrayList<Integer> xCoo = new ArrayList<>();
        ArrayList<Integer> yCoo = new ArrayList<>();

        int lines = WIDTH / 14;
        int multi = lines / 2;

        for (int m = multi; m < WIDTH / 2; m += multi) {
            xCoo.add(m);
            yCoo.add(m);

        }


        for (int j = 0; j < xCoo.size(); j++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xCoo.get(j), 0, WIDTH / 2, yCoo.get(j));
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0, yCoo.get(j), xCoo.get(j), WIDTH / 2);

        }
        xCoo.clear();
        yCoo.clear();
        for (int k = multi; k < WIDTH / 2; k += multi) {
            xCoo.add(k + WIDTH / 2);
            yCoo.add(k);

        }
        for (int n = 0; n < xCoo.size(); n++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xCoo.get(n), 0, WIDTH, yCoo.get(n));
            graphics.setColor(Color.GREEN);
            graphics.drawLine(WIDTH/2,yCoo.get(n),xCoo.get(n),WIDTH/2);

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