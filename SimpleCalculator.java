import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myfr extends JFrame implements ActionListener { // Implement ActionListener
    private Container c;
    private JLabel label1, label2;
    private JTextField t1, t2;
    private JButton plus, minus, multiply, divide;
    private JLabel result;

    Myfr() {
        setTitle("Simple Calculator");
        setSize(1000, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        // Labels for input fields
        label1 = new JLabel("First Number");
        label2 = new JLabel("Second Number");
        label1.setBounds(50, 50, 100, 20);
        label2.setBounds(50, 75, 100, 20);
        c.add(label1);
        c.add(label2);

        // Input text fields for numbers
        t1 = new JTextField();
        t1.setBounds(120, 50, 120, 20);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(120, 75, 120, 20);
        c.add(t2);

        // Buttons for operations
        plus = new JButton("+");
        plus.setBounds(120, 100, 50, 20);
        c.add(plus);

        minus = new JButton("-");
        minus.setBounds(180, 100, 50, 20);
        c.add(minus);

        multiply = new JButton("*");
        multiply.setBounds(240, 100, 50, 20);
        c.add(multiply);

        divide = new JButton("/");
        divide.setBounds(300, 100, 50, 20);
        c.add(divide);

        // Label to display the result
        result = new JLabel("Result");
        result.setBounds(50, 125, 100, 20);
        c.add(result);

        // Add action listeners to the buttons
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Parse the numbers from text fields
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());

            // Perform the operation based on which button was clicked
            if (e.getSource() == plus) {
                result.setText("Result: " + (a + b));
            } else if (e.getSource() == minus) {
                result.setText("Result: " + (a - b));
            } else if (e.getSource() == multiply) {
                result.setText("Result: " + (a * b));
            } else if (e.getSource() == divide) {
                if (b != 0) {
                    result.setText("Result: " + (a / b));
                } else {
                    result.setText("Cannot divide by 0");
                }
            }
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }
}

// Main class to launch the calculator application
public class SimpleCalculator {
    public static void main(String[] args) {
        Myfr frame = new Myfr(); // Instantiate Myfr (note the correct class name)
    }
}

