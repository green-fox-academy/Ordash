import javax.swing.*;

import java.awt.*;



import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles2 {
    public static void mainDraw(Graphics graphics) {

        int offset = WIDTH/10; //the 1/10 part of the canvas
        int x1 = 0;
        int y1 = WIDTH-offset;
        int x2 = (WIDTH/21);
        int x3 = (WIDTH/42);
        int y3 = (int) (8*offset-(((8*offset)/21)*(Math.sqrt(3)/2)))+offset;

        int y =0;
        int x =0;
        int triOffset=0;

        for (int i = 1; i < 22  ; i++) {

            for (int j = 1; j < 23-i; j++) {

                graphics.drawLine(x1+x,y1-y,x2+x,y1-y);  //c side
                graphics.drawLine(x2+x,y1-y,x3+x,y3-y);  //a side
                graphics.drawLine(x3+x,y3-y,x1+x,y1-y);  //b side
                x = triOffset+((WIDTH/21)*j);
            }
            triOffset += WIDTH/42;
            x=triOffset;

            y = (int) (((8*offset)/21)*(Math.sqrt(3)/2))*i;
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