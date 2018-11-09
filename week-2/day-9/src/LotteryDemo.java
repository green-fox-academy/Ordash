

import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class LotteryDemo{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo");
        Container cp = jf.getContentPane();
        MyCanvas tl = new MyCanvas();
        cp.add(tl);
        jf.setSize(1280, 800);
        jf.setVisible(true);
    }
}

class MyCanvas extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        if(g instanceof Graphics2D)
        {


            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Font myFont = new Font ("Courier New",1,40);
            g2.setFont(myFont);
            int random = (int)(Math.random()*43949268);

            g2.drawString("The number is: "+ random,300,400);


        }
    }
}