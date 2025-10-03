
public class Penyewa {
    private static int nextId = 1;
    private int id;
    private String nama;
    private String nomorTelepon;

    public Penyewa(String nama, String nomorTelepon) {
        this.id = nextId++;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nama: %s, No. Telp: %s", id, nama, nomorTelepon);
    }
}