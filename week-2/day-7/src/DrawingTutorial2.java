import javax.swing.*;

public class DrawingTutorial2 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Title");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingTutorial p = new DrawingTutorial();
        f.add(p);
        f.setSize(1000,600);
        f.setVisible(true);





    }
}
