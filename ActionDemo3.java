import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionDemo3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");
        frame.setVisible(true);

        Container c = frame.getContentPane();
        c.setLayout(null);

        //Using Annonymous inner class
        JButton btn = new JButton("click me");
        btn.setBounds(100, 100, 100, 50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.cyan);
            }
        });
    }
}
