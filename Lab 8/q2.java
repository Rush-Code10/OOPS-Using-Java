import javax.swing.*;

public class BMICalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BMI Calculator");

        JLabel weightLabel = new JLabel("Weight (kg):");
        JLabel heightLabel = new JLabel("Height (m):");
        JLabel resultLabel = new JLabel("BMI:");

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton calcButton = new JButton("Calculate");

        weightLabel.setBounds(30, 30, 100, 25);
        weightField.setBounds(140, 30, 100, 25);
        heightLabel.setBounds(30, 70, 100, 25);
        heightField.setBounds(140, 70, 100, 25);
        calcButton.setBounds(100, 110, 100, 30);
        resultLabel.setBounds(30, 150, 100, 25);
        resultField.setBounds(140, 150, 100, 25);

        calcButton.addActionListener(e -> {
            try {
                double weight = Double.parseDouble(weightField.getText());
                double height = Double.parseDouble(heightField.getText());
                double bmi = weight / (height * height);
                resultField.setText(String.format("%.2f", bmi));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid inputs.");
            }
        });

        frame.add(weightLabel); frame.add(weightField);
        frame.add(heightLabel); frame.add(heightField);
        frame.add(calcButton); frame.add(resultLabel); frame.add(resultField);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}