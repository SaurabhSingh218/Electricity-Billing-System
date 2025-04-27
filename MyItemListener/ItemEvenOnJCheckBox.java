package MyItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe2 extends JFrame implements ItemListener {

    JCheckBox c1, c2, c3, c4;
    JTextArea ta;

    public myframe2(){
        Container c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("10th");
        c1.setBounds(50, 100, 100, 20);
        c.add(c1);
        c1.addItemListener(this);

        c2 = new JCheckBox("12th");
        c2.setBounds(50, 120, 100, 20);
        c.add(c2);
        c2.addItemListener(this);

        c3 = new JCheckBox("Graduation");
        c3.setBounds(50, 140, 100, 20);
        c.add(c3);
        c3.addItemListener(this);

        c4 = new JCheckBox("Masters");
        c4.setBounds(50, 160, 100, 20);
        c.add(c4);
        c4.addItemListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 100, 100);
        c.add(ta);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.isSelected()){
            ta.setText("10th");
        }
        if(c2.isSelected()){
            ta.setText(ta.getText() + "\n" + "12th");
        }
        if(c3.isSelected()){
            ta.setText(ta.getText() + "\n" + "Graduation");
        }
        if(c4.isSelected()){
            ta.setText(ta.getText() + "\n" + "Masters");
        }


    }
}

public class ItemEvenOnJCheckBox {
    public static void main(String[] args) {
        myframe2 f = new myframe2();
        f.setTitle("Item Events");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
