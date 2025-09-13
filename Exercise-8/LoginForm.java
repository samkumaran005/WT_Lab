import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginForm extends JFrame implements ActionListener {
    JTextField userField;
    JPasswordField passField;
    JLabel statusLabel;
    JButton loginBtn;
    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));
        add(new JLabel("Username:"));
        userField = new JTextField();
        add(userField);
        add(new JLabel("Password:"));
        passField = new JPasswordField();
        add(passField);
        loginBtn = new JButton("Login");
        loginBtn.addActionListener(this);
        add(loginBtn);
        statusLabel = new JLabel("");
        add(statusLabel);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());
        if (username.equals("admin") && password.equals("1234"))
            statusLabel.setText("Login Successful!");
        else
            statusLabel.setText("Invalid Credentials.");
    }
    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
    }
}