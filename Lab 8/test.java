import javax.swing.*;
import java.awt.event.*;

public class test {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Simple Swing UI");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Using null layout for simplicity

        // Label
        JLabel label = new JLabel("Enter your name:");
        label.setBounds(20, 20, 150, 25);
        frame.add(label);

        // Text field
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 150, 25);
        frame.add(textField);

        // Button
        JButton button = new JButton("Say Hello");
        button.setBounds(100, 60, 120, 30);
        frame.add(button);

        // Label to show output
        JLabel outputLabel = new JLabel("");
        outputLabel.setBounds(20, 110, 300, 25);
        frame.add(outputLabel);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                outputLabel.setText("Hello, " + name + "!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
