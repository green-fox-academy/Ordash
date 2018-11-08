import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineplayMulti {
    public static void mainDraw(Graphics graphics){

        int box = WIDTH/8;
        int x1 = 0;
        int y1 = 0;

        int x2 = box;
        int y2 = box /14;

        int x3 = 0;
        int y3 = 0;

        int x4 = box /14;
        int y4 = 0;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8 ; j++) {

                graphics.setColor(Color.MAGENTA);




                for (int k = 0; k < 13; k++) {
                    graphics.drawLine(x1,y1,x2,y2);
                    x1 += box/14;
                    y2 += box/14;
                }
                x2 += box;
                y2 = y1 + box / 14;




                graphics.setColor(Color.GREEN);



                y4 = y1 + box;
                for (int l = 0; l < 13; l++) {
                    graphics.drawLine(x3, y3, x4, y4);
                    y3 += box / 14;
                    x4 += box / 14;
                }

                x3 += box;
                y3 = y1;

            }

            x1 = 0;
            y1 += box;
            x2 = box;
            x4 = box / 14;
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