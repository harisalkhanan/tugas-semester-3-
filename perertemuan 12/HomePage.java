import javax.swing.*;
import java.awt.*;

public class HomePage extends JPanel {
    public HomePage(MainFrame frame) {
        setLayout(new FlowLayout());

        JButton btnBooks = new JButton("Kelola Buku");
        JButton btnLogout = new JButton("Logout");

        add(btnBooks);
        add(btnLogout);

        btnBooks.addActionListener(e -> frame.showPage("books"));
        btnLogout.addActionListener(e -> frame.showPage("login"));
    }
}
