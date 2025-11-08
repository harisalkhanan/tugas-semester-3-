import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AplikasiKalkulator extends JFrame implements ActionListener {
    JTextField display;
    String angka = "";
    double hasil, angka1, angka2;
    int pilih;

    public AplikasiKalkulator() {
        setTitle("Aplikasi Kalkulator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        display = new JTextField();
        display.setBounds(20, 20, 240, 40);
        display.setBackground(Color.PINK);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display);

        String[] tombol = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","C","+",
            "B","E","="
        };

        int x = 20, y = 80;
        for (int i = 0; i < tombol.length; i++) {
            JButton btn = new JButton(tombol[i]);
            btn.setBounds(x, y, 50, 40);
            btn.addActionListener(this);
            add(btn);
            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 20;
                y += 50;
            }
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9.]")) {
            angka += cmd;
            display.setText(angka);
        } 
        else if (cmd.equals("+")) { angka1 = Double.parseDouble(angka); angka = ""; pilih = 1; }
        else if (cmd.equals("-")) { angka1 = Double.parseDouble(angka); angka = ""; pilih = 2; }
        else if (cmd.equals("*")) { angka1 = Double.parseDouble(angka); angka = ""; pilih = 3; }
        else if (cmd.equals("/")) { angka1 = Double.parseDouble(angka); angka = ""; pilih = 4; }
        else if (cmd.equals("C")) { angka = ""; display.setText(""); }
        else if (cmd.equals("B")) {
            if (angka.length() > 0) {
                angka = angka.substring(0, angka.length() - 1);
                display.setText(angka);
            }
        } 
        else if (cmd.equals("E")) {
            System.exit(0);
        } 
        else if (cmd.equals("=")) {
            try {
                angka2 = Double.parseDouble(angka);
                switch (pilih) {
                    case 1 -> hasil = angka1 + angka2;
                    case 2 -> hasil = angka1 - angka2;
                    case 3 -> hasil = angka1 * angka2;
                    case 4 -> hasil = angka1 / angka2;
                }

                if (hasil == (int) hasil) {
                    display.setText(String.valueOf((int) hasil));
                } else {
                    display.setText(String.valueOf(hasil));
                }
                angka = "";
            } catch (Exception ex) {
                display.setText("Error");
            }
        }
    }

    public static void main(String[] args) {
        new AplikasiKalkulator();
    }
}
