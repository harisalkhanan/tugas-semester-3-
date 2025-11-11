import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    CardLayout layout;
    JPanel mainPanel;

    ArrayList<Book> books = new ArrayList<>();
    boolean isAdmin = false;

    public MainFrame() {
        setTitle("Library System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        layout = new CardLayout();
        mainPanel = new JPanel(layout);

        LoginPage login = new LoginPage(this);
        HomePage home = new HomePage(this);
        BookPage bookPage = new BookPage(this);

        mainPanel.add(login, "login");
        mainPanel.add(home, "home");
        mainPanel.add(bookPage, "books");

        add(mainPanel);
        layout.show(mainPanel, "login");
    }

    public void showPage(String name) {
        layout.show(mainPanel, name);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
