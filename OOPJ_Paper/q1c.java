import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q1c extends JFrame {
    private JLabel statusLabel;

    public q1c() {
        // Set up the frame
        setTitle("Simple Form");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Create buttons panel
        JPanel buttonPanel = new JPanel();
        JButton submitButton = new JButton("SUBMIT");
        JButton cancelButton = new JButton("CANCEL");
        
        // Add action listeners to buttons
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("submitted");
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("cancelled");
            }
        });
        
        // Add buttons to panel
        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);
        
        // Create status label
        statusLabel = new JLabel("", JLabel.CENTER);
        
        // Add components to frame
        add(buttonPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        
        // Display the frame
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Create the form on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new q1c();
            }
        });
    }
}