import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingCalculator extends JFrame {
    private JTextField display;
    private String currentInput = "";
    private double firstOperand = 0;
    private String operator = "";

    public SwingCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String value = ((JButton) e.getSource()).getText();

            switch (value) {
                case "C":
                    currentInput = "";
                    operator = "";
                    firstOperand = 0;
                    display.setText("");
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    if (!currentInput.isEmpty()) {
                        firstOperand = Double.parseDouble(currentInput);
                        operator = value;
                        currentInput = "";
                        display.setText("");
                    }
                    break;
                case "=":
                    if (!currentInput.isEmpty()) {
                        double secondOperand = Double.parseDouble(currentInput);
                        double result = 0;
                        switch (operator) {
                            case "+": result = firstOperand + secondOperand; break;
                            case "-": result = firstOperand - secondOperand; break;
                            case "*": result = firstOperand * secondOperand; break;
                            case "/":
                                if (secondOperand == 0) {
                                    display.setText("Error: /0");
                                    return;
                                }
                                result = firstOperand / secondOperand;
                                break;
                        }
                        currentInput = String.valueOf(result);
                        display.setText(currentInput);
                    }
                    break;
                default: // Digits
                    currentInput += value;
                    display.setText(currentInput);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SwingCalculator().setVisible(true);
        });
    }
}
