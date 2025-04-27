import javax.swing.*;

public class MyMenuBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        menubar.add(file);

        JMenu edit = new JMenu("Edit");
        JMenuItem i4 = new JMenuItem("Undo");
        JMenuItem i5 = new JMenuItem("Redo");

        edit.add(i4);
        edit.add(i5);

        file.add(edit);

        frame.setJMenuBar(menubar);


        frame.setVisible(true);
    }
}
