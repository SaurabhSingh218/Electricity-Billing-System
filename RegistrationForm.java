import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Main class that extends JFrame and implements ActionListener
class Myfra extends JFrame implements ActionListener {

    // Declaring components for the registration form
    JLabel labe1, label2, label3, label4, label5;
    JTextField t1, t2;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea ta;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    JTextArea screen;

    // Constructor to initialize and set up the GUI components
    Myfra() {
        // Set title, size, and default close operation for the window
        setTitle("Registration Form");
        setSize(700, 500);
        setLocationRelativeTo(null); // Centers the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create container for layout and components
        Container c = getContentPane();
        c.setLayout(null); // Using absolute positioning

        // Name label and text field
        labe1 = new JLabel("Name");
        labe1.setBounds(20, 50, 100, 20);
        c.add(labe1);

        t1 = new JTextField();
        t1.setBounds(130, 50, 100, 20);
        c.add(t1);

        // Mobile label and text field
        labe1 = new JLabel("Mobile");
        labe1.setBounds(20, 100, 100, 20);
        c.add(labe1);

        t2 = new JTextField(); // This is for the mobile number
        t2.setBounds(130, 100, 100, 20);
        c.add(t2);

        // Gender label and radio buttons for male and female
        labe1 = new JLabel("Gender");
        labe1.setBounds(20, 150, 100, 20);
        c.add(labe1);

        male = new JRadioButton("Male");
        male.setBounds(130, 150, 80, 20);
        c.add(male);

        female = new JRadioButton("Female");
        female.setBounds(220, 150, 80, 20);
        c.add(female);

        // Set male as the default selected radio button
        male.setSelected(true);

        // Grouping the radio buttons so only one can be selected at a time
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        // DOB label and combo boxes for day, month, and year
        label4 = new JLabel("DOB");
        label4.setBounds(20, 200, 100, 20);
        c.add(label4);

        // Arrays containing the days, months, and years for the dropdown options
        String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        String[] years = {"1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
                "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979",
                "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                "2020", "2021", "2022", "2023", "2024"};

        // Adding combo boxes for day, month, and year selection
        day = new JComboBox(days);
        day.setBounds(130, 200, 50, 20);
        c.add(day);

        month = new JComboBox(months);
        month.setBounds(190, 200, 80, 20);
        c.add(month);

        year = new JComboBox(years);
        year.setBounds(280, 200, 60, 20);
        c.add(year);

        // Address label and text area for input
        label5 = new JLabel("Address");
        label5.setBounds(20, 250, 100, 20);
        c.add(label5);

        ta = new JTextArea("Write your address here....");
        ta.setBounds(130, 240, 200, 50);
        c.add(ta);

        // Checkbox for terms and conditions
        terms = new JCheckBox("Please accept terms and condition");
        terms.setBounds(50, 300, 250, 20);
        c.add(terms);

        // Submit button with action listener
        submit = new JButton("Submit");
        submit.setBounds(150, 350, 80, 20);
        c.add(submit);
        submit.addActionListener(this);

        // Text area to display submitted data
        screen = new JTextArea();
        screen.setBounds(350, 50, 300, 300);
        c.add(screen);
        c.setBackground(Color.pink);

        // Message label for displaying registration success or error
        msg = new JLabel("");
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);

        setVisible(true); // Make the frame visible
    }

    // Handling button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        // Check if terms and conditions are selected
        if (terms.isSelected()) {
            msg.setText("Registration Successful");

            // Retrieve user input from the form
            String name = t1.getText();
            String mobile = t2.getText();
            String gender = "male";
            if (female.isSelected()) {
                gender = "female";
            }

            // Combine day, month, and year into a date of birth string
            String dob = day.getSelectedItem() + "-" + month.getSelectedItem() + "-" + year.getSelectedItem();

            String address = ta.getText();

            // Display the collected data in the screen text area
            screen.setText("Name : " + name + "\n" + "Mobile : " + mobile + "\n" + "Gender : " + gender + "\n"
                    + "DOB : " + dob + "\n" + "Address : " + address);
        } else {
            // If terms and conditions are not accepted, show a message
            msg.setText("Accept terms and condition....");
            screen.setText("");
        }
    }
}

// Main class to launch the registration form
public class RegistrationForm {
    public static void main(String[] args) {
        Myfra frame = new Myfra(); // Create instance of Myfra to display form
    }
}



