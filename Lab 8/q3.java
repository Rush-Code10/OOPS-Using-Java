import javax.swing.*;

public class ButtonClickDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Demo");
        JLabel label = new JLabel("Click a button");
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        label.setBounds(100, 30, 200, 30);
        btn1.setBounds(50, 80, 100, 30);
        btn2.setBounds(160, 80, 100, 30);

        btn1.addActionListener(e -> label.setText("Button-1 clicked."));
        btn2.addActionListener(e -> label.setText("Button-2 clicked."));

        frame.add(label); frame.add(btn1); frame.add(btn2);
        frame.setSize(320, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}