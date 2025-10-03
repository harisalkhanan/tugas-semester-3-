
public class Transaksi {
    private static int nextId = 1;
    private int id;
    private Penyewa penyewa;
    private Kendaraan kendaraan;
    private int lamaSewa;
    private double totalBiaya;

    public Transaksi(Penyewa penyewa, Kendaraan kendaraan, int lamaSewa) {
        this.id = nextId++;
        this.penyewa = penyewa;
        this.kendaraan = kendaraan;
        this.lamaSewa = lamaSewa;

        this.totalBiaya = hitungTotalBiaya();

        this.kendaraan.setDisewa(true);
    }
    private double hitungTotalBiaya() {
        return this.kendaraan.getHargaSewaPerHari() * this.lamaSewa;
    }

    @Override
    public String toString() {
        return String.format("ID Transaksi: %d | Penyewa: %s | Kendaraan: %s | Lama Sewa: %d hari | Total Biaya: Rp%.0f",
                id, penyewa.getNama(), kendaraan.getMerk(), lamaSewa, totalBiaya);
    }
}