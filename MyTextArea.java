import javax.swing.*;
import java.awt.*;

public class MyTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        JTextArea textarea = new JTextArea();
        textarea.setBounds(100, 100, 400, 200);
        c.add(textarea);
        textarea.setText("This is texting text area");

        textarea.setFont(new Font("Arial", Font.BOLD, 20));
        textarea.setLineWrap(true);




        frame.setVisible(true);
    }
}
