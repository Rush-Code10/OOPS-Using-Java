import javax.swing.*;

public class LeapYearChecker {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");

        JLabel label = new JLabel("Enter Year:");
        JTextField yearField = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton check = new JButton("Check");

        label.setBounds(30, 30, 100, 25);
        yearField.setBounds(140, 30, 100, 25);
        check.setBounds(90, 70, 100, 30);
        result.setBounds(140, 110, 100, 25);

        check.addActionListener(e -> {
            try {
                int year = Integer.parseInt(yearField.getText());
                boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                result.setText(leap ? "Leap Year" : "Not Leap Year");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid year.");
            }
        });

        frame.add(label); frame.add(yearField); frame.add(check); frame.add(result);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}