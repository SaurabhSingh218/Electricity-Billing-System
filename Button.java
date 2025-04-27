import javax.swing.*;
import java.awt.*;

public class Button {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null); // Use absolute positioning

//        JButton btn = new JButton("Click Me");
//        btn.setSize(200, 30);
//        btn.setLocation(100, 100);
//        c.add(btn);
//
//        frame.setVisible(true);
//        btn.setFont(new Font("Arial", Font.BOLD, 25));
//        btn.setText("mybutton");
//
//        btn.setForeground(Color.CYAN);
//        btn.setBackground(Color.BLACK);
//
//        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
//
//        btn.setEnabled(true); // to disable button
//
//        btn.setVisible(true);
//        // to show image in button

        ImageIcon icon = new ImageIcon("E:\\JAVA SWING\\untitled\\images.jpg");
        JButton btn = new JButton(icon);
        btn.setSize(icon.getIconWidth()+ 100 , icon.getIconHeight() +100 );
        btn.setLocation(100, 100);
        c.add(btn);
        frame.setVisible(true);
    }
}