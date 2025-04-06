import javax.swing.*;
import java.awt.event.*;

public class AdditionApp {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("Addition of Two Numbers");

        // Create labels
        JLabel label1 = new JLabel("Enter first number:");
        JLabel label2 = new JLabel("Enter second number:");
        JLabel resultLabel = new JLabel("Result:");

        // Create text fields
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // Result field should not be editable

        // Create a button
        JButton addButton = new JButton("Add");

        // Set component bounds (absolute positioning)
        label1.setBounds(30, 30, 150, 30);
        textField1.setBounds(180, 30, 150, 30);

        label2.setBounds(30, 70, 150, 30);
        textField2.setBounds(180, 70, 150, 30);

        addButton.setBounds(120, 110, 100, 30);

        resultLabel.setBounds(30, 150, 150, 30);
        resultField.setBounds(180, 150, 150, 30);

        // Add action listener to the button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse numbers and compute sum
                    int num1 = Integer.parseInt(textField1.getText());
                    int num2 = Integer.parseInt(textField2.getText());
                    int sum = num1 + num2;

                    // Display result
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers!");
                }
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(addButton);
        frame.add(resultLabel);
        frame.add(resultField);

        // Frame settings
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
