import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JScrollPane scrollPane;
    private JTextArea txtArea;

    public MainForm() {
        add(mainPanel);
        setTitle("CBL - Main Form Application");
        setSize(1280, 1080);
    }

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
    }
}
