package MyItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class myframe extends JFrame implements ItemListener {

    JComboBox combo;
    JTextArea ta;

    public myframe(){
        Container c = getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C", "D"};
        combo = new JComboBox(values);
        combo.setBounds(50, 50, 100, 30);
        c.add(combo);
        combo.addItemListener(this);

        ta = new JTextArea();
        ta.setBounds(200, 50, 100, 100);
        c.add(ta);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        ta.setText(combo.getSelectedItem().toString());
    }
}

public class ItemEvent1 {
    public static void main(String[] args) {
        myframe2 f = new myframe2();
        f.setTitle("Item Events");
        f.setBounds(100, 100, 400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
