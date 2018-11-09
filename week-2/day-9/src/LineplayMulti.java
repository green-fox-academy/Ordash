import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineplayMulti {
    public static void mainDraw(Graphics graphics){

        //change only the square density and the line density
        int squareDensity = 4;
        int lineDensity = 14;
        //---------------------------------------


        //This will give you the size of 1 square pattern
        int squareSize = WIDTH/squareDensity;

        int x1 = 0;
        int y1 = 0;

        int x2 = squareSize;
        int y2 = squareSize /lineDensity;

        int x3 = 0;
        int y3 = 0;

        int x4 = squareSize /lineDensity;
        int y4 = squareSize;

        //Trying to use the chessboard method.
        //Thinking in 2 dimension 1 for loop for each dimension.
        //Somehow I have to assign x coordinates to the y coordinates after the finished loops

        for (int i = 0; i < squareDensity; i++) {

            for (int j = 0; j < squareDensity ; j++) {

                graphics.setColor(Color.MAGENTA);

                for (int k = 0; k < lineDensity; k++) {
                    graphics.drawLine(x1,y1,x2,y2);
                    x1 += squareSize/lineDensity;
                    y2 += squareSize/lineDensity;
                }
                x2 += squareSize;
                y2 = y1 + squareSize / lineDensity;


                graphics.setColor(Color.GREEN);



                for (int l = 0; l < lineDensity; l++) {
                    graphics.drawLine(x3, y3, x4, y4);
                    y3 += squareSize / lineDensity;
                    x4 += squareSize / lineDensity;
                }

                x3 += squareSize;
                y3 = y1;

            }

            x1 = 0;
            y1 += squareSize;

            x2 = squareSize;
            y2 += squareSize;

            x3 = 0;
            y3 +=squareSize;


            x4 = squareSize / lineDensity;
            y4 += squareSize;
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