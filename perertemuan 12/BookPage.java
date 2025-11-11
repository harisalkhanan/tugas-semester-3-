import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BookPage extends JPanel {
    public BookPage(MainFrame frame) {
        setLayout(new BorderLayout());

        String[] cols = {"Judul", "Penulis", "Tahun"};
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        JPanel buttons = new JPanel();
        JButton btnAdd = new JButton("Tambah");
        JButton btnEdit = new JButton("Edit");
        JButton btnDelete = new JButton("Hapus");
        JButton btnBack = new JButton("Kembali");

        buttons.add(btnAdd);
        buttons.add(btnEdit);
        buttons.add(btnDelete);
        buttons.add(btnBack);

        add(scroll, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        btnAdd.addActionListener(e -> {
            String title = JOptionPane.showInputDialog("Judul Buku:");
            String author = JOptionPane.showInputDialog("Penulis:");
            String yearStr = JOptionPane.showInputDialog("Tahun:");

            try {
                int year = Integer.parseInt(yearStr);
                Book b = new Book(title, author, year);
                frame.books.add(b);
                model.addRow(new Object[]{title, author, year});
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid");
            }
        });

        btnEdit.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return;

            Book b = frame.books.get(row);

            String title = JOptionPane.showInputDialog("Judul:", b.getTitle());
            String author = JOptionPane.showInputDialog("Penulis:", b.getAuthor());
            String yearStr = JOptionPane.showInputDialog("Tahun:", b.getYear());

            try {
                int year = Integer.parseInt(yearStr);
                b.setTitle(title);
                b.setAuthor(author);
                b.setYear(year);

                model.setValueAt(title, row, 0);
                model.setValueAt(author, row, 1);
                model.setValueAt(year, row, 2);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid");
            }
        });

        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row == -1) return;

            frame.books.remove(row);
            model.removeRow(row);
        });

        btnBack.addActionListener(e -> frame.showPage("home"));
    }
}
