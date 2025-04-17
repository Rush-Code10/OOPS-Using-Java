import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q6 extends JFrame implements ActionListener {
    // Declare the components
    private JLabel titleLabel, lengthLabel, widthLabel, areaLabel, perimeterLabel;
    private JTextField lengthField, widthField, areaField, perimeterField;
    private JButton calculateButton;
    
    public q6() {
        // Set up the frame
        super("Area_Perimeter_Test");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Using absolute positioning
        
        // Create the title label
        titleLabel = new JLabel("Area and Perimeter of Rectangle");
        titleLabel.setBounds(100, 10, 250, 20);
        add(titleLabel);
        
        // Create input fields and labels
        lengthLabel = new JLabel("Enter Length:");
        lengthLabel.setBounds(30, 40, 100, 20);
        add(lengthLabel);
        
        lengthField = new JTextField();
        lengthField.setBounds(150, 40, 200, 20);
        add(lengthField);
        
        widthLabel = new JLabel("Enter Width:");
        widthLabel.setBounds(30, 70, 100, 20);
        add(widthLabel);
        
        widthField = new JTextField();
        widthField.setBounds(150, 70, 200, 20);
        add(widthField);
        
        // Create calculate button
        calculateButton = new JButton("_________Calculate_________");
        calculateButton.setBounds(50, 100, 300, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);
        
        // Create output fields and labels
        areaLabel = new JLabel("Area is:");
        areaLabel.setBounds(30, 140, 100, 20);
        add(areaLabel);
        
        areaField = new JTextField();
        areaField.setBounds(150, 140, 200, 20);
        areaField.setEditable(false);
        add(areaField);
        
        perimeterLabel = new JLabel("Perimeter is:");
        perimeterLabel.setBounds(30, 170, 100, 20);
        add(perimeterLabel);
        
        perimeterField = new JTextField();
        perimeterField.setBounds(150, 170, 200, 20);
        perimeterField.setEditable(false);
        add(perimeterField);
        
        // Center the frame on screen
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                // Get the length and width from the text fields
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                
                // Calculate area and perimeter
                double area = length * width;
                double perimeter = 2 * (length + width);
                
                // Display the results
                areaField.setText(String.valueOf(area));
                perimeterField.setText(String.valueOf(perimeter));
            } catch (NumberFormatException ex) {
                // Handle invalid input
                JOptionPane.showMessageDialog(this, 
                                             "Please enter valid numeric values for length and width.",
                                             "Input Error",
                                             JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public static void main(String[] args) {
        // Create the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q6();
            }
        });
    }
}