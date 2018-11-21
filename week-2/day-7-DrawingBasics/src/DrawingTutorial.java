import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DrawingTutorial extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);

        g.setColor(Color.BLUE);
        g.fillRect(25,25, 100, 30);

        g.setColor(new Color(190,81,215));
        g.fillRect(25,65, 100, 30);

        g.setColor(Color.RED);
        g.drawString("This is some text", 25, 120);

        g.setColor(Color.BLUE);
        g.drawLine(200, 25,220, 80);

        g.setColor(Color.RED);
        g.drawRect(250,250,400,200);

        g.setColor(Color.BLACK);
        g.fillOval(250,250,400,200);

        g.setColor(Color.ORANGE);
        g.fill3DRect(300, 250,100,24, true);

        int xpoints[] = {25, 145, 25, 145, 25, 300};
        int ypoints[] = {25, 25, 145, 145, 25, 300};
        int npoints = 6;

        g.drawPolygon(xpoints, ypoints, npoints);

        for (int i = 0; i < 50; i++) {
            g.setColor(new Color(144, 150, i));
            g.fillRect(i,i,20+i,20+i);
        }

    }



}
