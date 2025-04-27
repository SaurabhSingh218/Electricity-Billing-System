package ActionEVents.ActionListenermy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myfar extends JFrame implements ActionListener {
    JMenuBar menubar;
    JMenu file, edit;
    JMenuItem i1, i2, i3, i4, i5, i6, i7;
    JTextArea ta;

    public Myfar() {
        Container c = getContentPane();
        c.setLayout(null);

        menubar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");

        i1 = new JMenuItem("New");
        i2 = new JMenuItem("Open");
        i3 = new JMenuItem("Save");
        i4 = new JMenuItem("Cut");
        i5 = new JMenuItem("Copy");
        i6 = new JMenuItem("Paste");
        i7 = new JMenuItem("Select All");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        edit.add(i4);
        edit.add(i5);
        edit.add(i6);
        edit.add(i7);

        menubar.add(file);
        menubar.add(edit);

        this.setJMenuBar(menubar);

        ta = new JTextArea();
        ta.setBounds(10, 10, 370, 370);
        c.add(ta);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == i1){
            ta.setText("New File...");
        }
        if(e.getSource() == i2){
            ta.setText("Open File...");
        }
        if(e.getSource() == i4){
            ta.cut();
        }
    }


    public class ActionListener3 {
        public static void main(String[] args) {
            Myfar f = new Myfar();
            f.setTitle("Menubar Example");
            f.setBounds(100, 100, 400, 400);
            f.setVisible(true);
        }
    }
}
