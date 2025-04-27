import javax.swing.*;
import java.awt.*;

public class MyPassWordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null); // Use absolute positioning

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 50, 120, 30);
        c.add(pass);

        pass.setText("123466985");

        pass.setFont(new Font("Arial", Font.PLAIN, 25));
        // Apply all the text field property

        pass.setEchoChar('*'); // instead of dot  -> *
        pass.setEchoChar((char)0);


        frame.setVisible(true);
    }
}
