import javax.swing.*;

// First attempt at GUI
public class JavaGUIProject {



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Click here!");
        button.setBounds(100, 100, 50, 50);

        frame.add(button);

        frame.setVisible(true);
    }
}
