import javax.swing.*;

public class TempConverter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("F to C Converter");

        JLabel fLabel = new JLabel("Fahrenheit:");
        JTextField fInput = new JTextField();
        JTextField cOutput = new JTextField();
        cOutput.setEditable(false);

        JButton convert = new JButton("Convert");

        fLabel.setBounds(30, 30, 100, 25);
        fInput.setBounds(140, 30, 100, 25);
        convert.setBounds(90, 70, 100, 30);
        cOutput.setBounds(140, 110, 100, 25);

        convert.addActionListener(e -> {
            try {
                double f = Double.parseDouble(fInput.getText());
                double c = (f - 32) * 5 / 9;
                cOutput.setText(String.format("%.2f", c));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input.");
            }
        });

        frame.add(fLabel); frame.add(fInput); frame.add(convert); frame.add(cOutput);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
