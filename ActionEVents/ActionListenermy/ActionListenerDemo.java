package ActionEVents.ActionListenermy;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // Import the correct package for ActionEvent

class myframe extends JFrame implements ActionListener {
    Container c;
    JTextField t1;
    JButton btn;

    public myframe() {
        c = this.getContentPane();
        c.setLayout(null);
        btn = new JButton("Click me");
        btn.setBounds(100, 100, 100, 30);
        c.add(btn);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // Use ActionEvent here
        String str = btn.getText();
        btn.setText(str.toUpperCase());
    }
}

public class ActionListenerDemo { // Changed class name to avoid conflict with the interface name
    public static void main(String[] args) {
        myframe f = new myframe();
        f.setTitle("Action Event");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}