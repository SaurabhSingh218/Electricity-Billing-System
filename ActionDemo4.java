import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Event handling using another class
public class ActionDemo4 implements ActionListener {
    public static Container c;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500); // Adjust size as needed
        frame.setTitle("My Swing Project");

        c = frame.getContentPane();
        c.setLayout(null); // Set layout before adding components

        JButton red = new JButton("RED");
        JButton yellow = new JButton("YELLOW");
        JButton cyan = new JButton("CYAN");

        red.setBounds(100, 100, 100, 50);
        yellow.setBounds(300, 100, 100, 50);
        cyan.setBounds(500, 100, 100, 50);

        c.add(red);
        c.add(yellow);
        c.add(cyan);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass()); // Added a new class for yellow button
        cyan.addActionListener(new CyanClass()); // Added a new class for cyan button

        frame.setVisible(true); // Make the frame visible after adding components
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implement common action handling here if needed
    }
}

// Class to handle red button action
class RedClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.RED);
    }
}

// Class to handle yellow button action
class YellowClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.YELLOW);
    }
}

// Class to handle cyan button action
class CyanClass implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.CYAN);
    }
}

