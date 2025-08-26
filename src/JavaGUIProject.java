import javax.swing.*;

// My first attempt at a GUI
public class JavaGUIProject {

    public static void main(String[] args) {

        // Making the frame
        JFrame frame = new JFrame("hely's wonderful GUI");
        frame.setSize(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Playing around with elements
        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 200, 50);

        JButton button = new JButton("Click here!");
        button.setBounds(180, 20, 50, 25);


        // Adding elements to the frame
        frame.add(textField);
        frame.add(button);


        frame.setVisible(true);
    }
}
