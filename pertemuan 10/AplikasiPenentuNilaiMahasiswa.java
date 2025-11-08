import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiPenentuNilaiMahasiswa extends JFrame implements ActionListener {
    JTextField txtNama, txtTugas, txtUTS, txtUAS;
    JLabel lblNamaHasil, lblRata, lblGrade, lblHasil;
    JButton btnHitung, btnBersih, btnSimpan, btnKeluar;

    public AplikasiPenentuNilaiMahasiswa() {
        setTitle("Aplikasi Penentu Nilai Mahasiswa");
        setSize(500, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panelInput = new JPanel();
        panelInput.setBackground(Color.GREEN.brighter());
        panelInput.setBounds(20, 70, 200, 180);
        panelInput.setLayout(null);
        add(panelInput);

        JPanel panelHasil = new JPanel();
        panelHasil.setBackground(Color.YELLOW);
        panelHasil.setBounds(230, 70, 230, 180);
        panelHasil.setLayout(null);
        add(panelHasil);

        JLabel lblNama = new JLabel("Nama Lengkap");
        lblNama.setBounds(20, 20, 120, 25);
        add(lblNama);

        txtNama = new JTextField();
        txtNama.setBounds(150, 20, 200, 25);
        add(txtNama);

        panelInput.add(new JLabel("Tugas Murni")).setBounds(10, 20, 100, 25);
        panelInput.add(new JLabel("Nilai UTS")).setBounds(10, 60, 100, 25);
        panelInput.add(new JLabel("Nilai UAS")).setBounds(10, 100, 100, 25);

        txtTugas = new JTextField();
        txtUTS = new JTextField();
        txtUAS = new JTextField();

        panelInput.add(txtTugas).setBounds(110, 20, 70, 25);
        panelInput.add(txtUTS).setBounds(110, 60, 70, 25);
        panelInput.add(txtUAS).setBounds(110, 100, 70, 25);

        panelHasil.add(new JLabel("Nama")).setBounds(10, 20, 100, 25);
        panelHasil.add(new JLabel("Nilai Rata-rata")).setBounds(10, 60, 100, 25);
        panelHasil.add(new JLabel("Grade")).setBounds(10, 100, 100, 25);
        panelHasil.add(new JLabel("Hasil")).setBounds(10, 140, 100, 25);

        lblNamaHasil = new JLabel("-");
        lblRata = new JLabel("-");
        lblGrade = new JLabel("-");
        lblHasil = new JLabel("-");

        panelHasil.add(lblNamaHasil).setBounds(120, 20, 100, 25);
        panelHasil.add(lblRata).setBounds(120, 60, 100, 25);
        panelHasil.add(lblGrade).setBounds(120, 100, 100, 25);
        panelHasil.add(lblHasil).setBounds(120, 140, 100, 25);

        btnHitung = new JButton("Hitung");
        btnBersih = new JButton("Bersihkan");
        btnSimpan = new JButton("Simpan");
        btnKeluar = new JButton("Keluar");

        btnHitung.setBounds(20, 260, 100, 25);
        btnBersih.setBounds(130, 260, 100, 25);
        btnSimpan.setBounds(240, 260, 100, 25);
        btnKeluar.setBounds(350, 260, 100, 25);

        add(btnHitung);
        add(btnBersih);
        add(btnSimpan);
        add(btnKeluar);

        btnHitung.addActionListener(this);
        btnBersih.addActionListener(this);
        btnKeluar.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnHitung) {
            try {
                double tugas = Double.parseDouble(txtTugas.getText());
                double uts = Double.parseDouble(txtUTS.getText());
                double uas = Double.parseDouble(txtUAS.getText());
                double rata = (tugas + uts + uas) / 3;
                String grade;
                String hasil;

                if (rata >= 80) grade = "A";
                else if (rata >= 70) grade = "B";
                else if (rata >= 60) grade = "C";
                else grade = "D";

                hasil = (rata >= 60) ? "Lulus" : "Tidak Lulus";

                lblNamaHasil.setText(txtNama.getText());
                lblRata.setText(String.format("%.2f", rata));
                lblGrade.setText(grade);
                lblHasil.setText(hasil);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid!");
            }
        } else if (e.getSource() == btnBersih) {
            txtNama.setText("");
            txtTugas.setText("");
            txtUTS.setText("");
            txtUAS.setText("");
            lblNamaHasil.setText("-");
            lblRata.setText("-");
            lblGrade.setText("-");
            lblHasil.setText("-");
        }
    }

    public static void main(String[] args) {
        new AplikasiPenentuNilaiMahasiswa();
    }
}
