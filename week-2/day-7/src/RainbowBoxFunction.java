import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int size = WIDTH;
        for (int i = 0; i < size; i++) {
            size -= 5;
            int[] color = {(int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)};
            squareDrawing(size, color, graphics);


        }


    }

    public static void squareDrawing(int sinput, int[] cinput, Graphics ginput) {

        int place = (WIDTH-sinput)/2;
        int red = cinput[0];
        int green = cinput[1];
        int blue = cinput[2];
        ginput.setColor(new Color(red,green,blue));
        ginput.fillRect(place,place,sinput,sinput);



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