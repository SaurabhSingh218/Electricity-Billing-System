import javax.swing.*;
import java.awt.*;

public class MyFirstJFrame {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setVisible(true);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//       frame.setSize(1000, 500); -> for providing layout
//       frame.setLocation(100, 100); -> for prviding space from x and y axis

        frame.setBounds(100, 100, 1000, 500);

        frame.setTitle("My swing Project");

        ImageIcon icon = new ImageIcon("25694.png");
        frame.setIconImage(icon.getImage()); // to set the icon image at the top left side

        Container c = frame.getContentPane();
        //Color color = new Color(// put rgb value);
        c.setBackground(Color.cyan);
        frame.setResizable(false);

    }
}
