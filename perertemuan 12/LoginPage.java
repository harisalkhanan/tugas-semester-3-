import javax.swing.*;
import java.awt.*;

public class LoginPage extends JPanel {
    public LoginPage(MainFrame frame) {
        setLayout(new GridLayout(4, 1));

        JTextField txtUser = new JTextField();
        JPasswordField txtPass = new JPasswordField();
        JButton btnLogin = new JButton("Login");

        add(new JLabel("Username:"));
        add(txtUser);
        add(new JLabel("Password:"));
        add(txtPass);
        add(btnLogin);

        btnLogin.addActionListener(e -> {
            String u = txtUser.getText();
            String p = String.valueOf(txtPass.getPassword());

            if (u.equals("admin") && p.equals("admin")) {
                frame.isAdmin = true;
                frame.showPage("home");
            } else if (u.equals("user") && p.equals("user")) {
                frame.isAdmin = false;
                frame.showPage("home");
            } else {
                JOptionPane.showMessageDialog(this, "Login gagal");
            }
        });
    }
}
