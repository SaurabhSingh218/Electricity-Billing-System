
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe2 extends JFrame implements ActionListener {

    Container c;
    JButton btn = new JButton("Red");
    JButton btn1 = new JButton("Yellow");
    JButton btn2 = new JButton("Cyan");

    Myframe2(){
        c = this.getContentPane();
        c.setLayout(null);

        btn.setBounds(100, 100, 100, 50);
        btn1.setBounds(200, 100, 100, 50);
        btn2.setBounds(300, 100, 100, 50);

        c.add(btn);
        c.add(btn1);
        c.add(btn2);
        btn.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            c.setBackground(Color.red);

        }
        if(e.getSource() == btn1){
            c.setBackground(Color.YELLOW);

        }
        if(e.getSource() == btn2){
            c.setBackground(Color.CYAN);

        }
    }
}



public class ActionDemo2 {
    public static void main(String[] args) {
        Myframe2 f = new Myframe2();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
