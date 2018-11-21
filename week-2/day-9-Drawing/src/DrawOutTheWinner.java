
import java.awt.*;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawOutTheWinner{
    public static void main(String[] args) {
        JFrame jf = new JFrame("Demo");
        Container cp = jf.getContentPane();
        MyCanvas2 tl = new MyCanvas2();
        cp.add(tl);
        jf.setSize(1280, 800);
        jf.setVisible(true);
    }
}

class MyCanvas2 extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        if(g instanceof Graphics2D)
        {
            String[] names = {"aczender", "bekobarna", "beltekylevi", "bleaksmile", "ChrisFrill", "DianaBernardo","giba86"
                    ,"Gilthanas122"
                    ,"Jesper9108"
                    ,"lyancsie"
                    ,"markpalotas"
                    ,"Merilien"
                    ,"otimkpu"
                    ,"peterripka"
                    ,"piotriljics"
                    ,"pitner33"
                    ,"refike"
                    ,"Dániel"
                    ,"Squawk1234"
                    ,"starlinginferno"
                    ,"szirmaidora"
                    ,"tamaspls"
                    ,"zsuzsagal"};

            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Font myFont = new Font ("Courier New",1,40);
            g2.setFont(myFont);
            int random = (int)(Math.random()*24);
            for (int i = 0; i < names.length; i++) {
                if(i == random)

            g2.drawString("The winner is: "+ names[i],300,400);
            }

        }
    }
}