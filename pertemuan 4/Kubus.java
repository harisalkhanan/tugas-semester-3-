// File: Kubus.java
public class Kubus extends BangunRuang {
    private double sisi;

    // Constructor untuk inisialisasi properti kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        // Rumus volume kubus: sisi^3
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungLuasPermukaan() {
        // Rumus luas permukaan kubus: 6 * sisi^2
        return 6 * Math.pow(sisi, 2);
    }
}