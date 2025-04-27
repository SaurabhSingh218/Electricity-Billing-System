import javax.swing.*;
import java.awt.*;

public class MyTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null); // Use absolute positioning

        JTextField t1= new JTextField();
        t1.setBounds(100, 50, 120, 30);
        c.add(t1);

        t1.setText("Saurabh Kumar");
        Font font = new Font("Italic", Font.BOLD, 20);
        t1.setFont(font);

        t1.setForeground(Color.GREEN);
        t1.setBackground(Color.CYAN);

        t1.setEditable(false);

        frame.setVisible(true);
    }
}