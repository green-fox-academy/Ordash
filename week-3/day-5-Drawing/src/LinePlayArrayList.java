import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayArrayList {
    public static void mainDraw(Graphics graphics){

        ArrayList<Integer> xCoo = new ArrayList<>();
        ArrayList<Integer> yCoo = new ArrayList<>();

        int lines = WIDTH/14;

        for (int i = lines; i < WIDTH ; i+=lines) {
            xCoo.add(i);
            yCoo.add(i);

        }



        for (int j = 0; j < xCoo.size(); j++) {
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(xCoo.get(j), 0,WIDTH,yCoo.get(j));
            graphics.setColor(Color.GREEN);
            graphics.drawLine(0,yCoo.get(j),xCoo.get(j),WIDTH);

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