import javax.swing.*;

public class FormButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        JLabel label = new JLabel("");
        JButton submit = new JButton("SUBMIT");
        JButton cancel = new JButton("CANCEL");

        submit.setBounds(50, 50, 100, 30);
        cancel.setBounds(160, 50, 100, 30);
        label.setBounds(100, 100, 150, 30);

        submit.addActionListener(e -> label.setText("submitted"));
        cancel.addActionListener(e -> label.setText("cancelled"));

        frame.add(submit); frame.add(cancel); frame.add(label);
        frame.setSize(320, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
