package MyItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe1 extends JFrame implements ItemListener {

    JRadioButton male, female;
    JTextArea ta;

    public myframe1(){
        Container c = getContentPane();
        c.setLayout(null);

        male = new JRadioButton("Male");
        male.setBounds(100, 100, 100, 20);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(100, 120, 100, 20);
        c.add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 100, 100);
        c.add(ta);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource() == male){
            ta.setText("Male is Clicked");
        }
        if(e.getSource() == female){
            ta.setText("Female is clicked");
        }

    }
}

public class ItemEventOnJRadio {
    public static void main(String[] args) {
        myframe2 f = new myframe2();
        f.setTitle("Item Events");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

