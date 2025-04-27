import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends JFrame implements ActionListener {

    Container c;
    JButton btn;
     Myframe(){
         c = this.getContentPane();
         c.setLayout(null);
         btn = new JButton("Click Me");
         btn.setBounds(100, 100, 50, 50);
         c.add(btn);
         btn.addActionListener(this);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.CYAN);
    }
}



public class ActionDemo {
    public static void main(String[] args) {
        Myframe2 f = new Myframe2();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
