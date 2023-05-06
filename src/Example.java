import javax.swing.*;

public class Example {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Hello, World!"));

        JScrollPane scrollPane = new JScrollPane(panel);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JFrame frame = new JFrame("Hide Horizontal Scroll Bar Example");
        frame.getContentPane().add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
