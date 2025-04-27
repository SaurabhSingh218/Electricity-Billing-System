import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyComboBox");
        frame.setSize(1000, 500);

        frame.setLocationRelativeTo(null); // location at the centre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C", "D", "E"};
        //Create J combo box
        JComboBox c1 = new JComboBox(values);
        c1.setBounds(100, 100, 100, 30);
        c.add(c1);

        //c1.setEditable(true);
        //Bydefault set selected item
//        c1.setSelectedIndex(2);
//        c1.setSelectedItem("B");

        JButton button = new JButton("Ok");
        button.setBounds(300, 100, 100, 30);
        c.add(button);

        JLabel label = new JLabel("");
        label.setBounds(100, 300, 100, 30);
        c.add(label);

        //add new item as combo box
        c1.addItem("F");
        c1.removeItem("C");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String)c1.getSelectedItem();
                label.setText(item);
            }
        });

        frame.setVisible(true);

    }
}
