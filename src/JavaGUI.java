import javax.swing.*;

// First attempt at GUI
public class JavaGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Click here!")

        frame.setVisible(true);
    }
}
