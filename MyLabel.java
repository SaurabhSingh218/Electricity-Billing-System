import javax.swing.*;
import java.awt.*;

public class MyLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 4000, 4000); // Adjust size as needed
        frame.setTitle("My Swing Project");

        Container c = frame.getContentPane();
        c.setLayout(null); // Use absolute positioning

        // Load the image
        ImageIcon icon = new ImageIcon("E:\\JAVA SWING\\untitled\\images.jpg");

        // Print the dimensions of the image
        System.out.println("Image width: " + icon.getIconWidth());
        System.out.println("Image height: " + icon.getIconHeight());

        // Check if the image is loaded correctly
        if (icon.getIconWidth() == -1) {
            System.err.println("Image not found at the specified path.");
            System.exit(1);
        }

        JLabel label = new JLabel(icon);
        label.setBounds(100, 50, icon.getIconWidth(), icon.getIconHeight());
        c.add(label);

        // Set the frame to be visible after adding components
        frame.setVisible(true); // Ensure this is last
    }
}

