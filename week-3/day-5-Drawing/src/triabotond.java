import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class triabotond{
    public static void mainDraw(Graphics g) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me how many rows should the triangle contain!");
        int numberOfRows = scanner.nextInt();
        for (int row = 0; row < numberOfRows; row++) {
            int[] x = {150, 156, 162};
            int[] y = {12, 2, 12};
            int lengthOfArrayX = x.length;
            for (int j = 0; j < lengthOfArrayX; j++) {
                x[j] -= 6 * row;
                y[j] += 10 * row;
            }
            for (int j = 0; j < row + 1; j++) {
                for (int k = 0; k < lengthOfArrayX; k++) {
                    if (j != 0){
                        x[k] += 12;
                    }
                }
                g.drawPolygon(x, y, 3);
            }
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