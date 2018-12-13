/*
        Class which creates Variegated Stairs
        Written 4/26/00 by Andrea Danyluk
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class RecursiveRect extends JComponent {
    // coordinates of the lower left corner of the rectangles
    private static final Point lowerLeft = new Point(50, 550);

    // size of the largest square
    private static final int initialSize = 256;

    // color of the largest square
    private static final Color initialColor = new Color(225, 225, 255);

    // minimum width and height for a square in order to build squares inside it
    private static final int MINSIZE = 2;

    // used to darken the color of squares built
    private static final int DARKNESS_FACTOR = 30;

    /**
     * Draw the rectangles recursively
     * @param size size of the current rectangle
     * @param aColor color of the current rectangle
     * @param g graphics to draw on
     */
    public void drawRectangle(int size, Color aColor, Graphics g) {
        // Base case -- draw small square
        if (size <= MINSIZE) {
            drawSquare(size, aColor, g);
            return;
        }

        // Recursive case -- draw a square with squares inside it
        drawSquare(size, aColor, g);

        // darken the color for the new square
        Color newColor = new Color(aColor.getRed() - DARKNESS_FACTOR, aColor
                .getGreen()
                - DARKNESS_FACTOR, aColor.getBlue());

        // Draw the next sauare smaller
        drawRectangle(size / 2, newColor, g);

    }

    /**
     * Draw a single square
     * @param size width and height of the square
     * @param aColor color of the square
     * @param g graphics to draw on
     */
    private void drawSquare(int size, Color aColor, Graphics g) {
        g.setColor(aColor);
        g.fillRect((int) lowerLeft.getX(), (int) lowerLeft.getY() - size, size,
                size);
    }

    /**
     * Draw the complete set of rectangles
     * @param g graphics to draw on.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        drawRectangle(initialSize, initialColor, g);
    }

    /**
     * A program to draw squares recursively that share the same lower left corner, but
     * have different sizes and colors.
     *
     * @param args
     *            None expected.
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Recursive stairs");
        f.setSize(new Dimension(600, 650));

        RecursiveRect stairs = new RecursiveRect();
        f.getContentPane().add(stairs, BorderLayout.CENTER);

        // Display the window.
        f.setVisible(true);

    }

}