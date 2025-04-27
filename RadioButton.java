import javax.swing.*;
import java.awt.*;



public class RadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null);

        JRadioButton radio1 = new JRadioButton("Male");
        radio1.setBounds(100, 100, 100, 20);
        c.add(radio1);

        JRadioButton radio2 = new JRadioButton("Female");
        radio2.setBounds(200, 100, 100, 20);
        c.add(radio2);
        frame.setVisible(true);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
    }
}
