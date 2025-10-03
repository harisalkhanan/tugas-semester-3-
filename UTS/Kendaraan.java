
public class Kendaraan {
    private String nomorPolisi;
    private String merk;
    private String model;
    private int tahun;
    private double hargaSewaPerHari;
    private boolean disewa; 

    public Kendaraan(String nomorPolisi, String merk, String model, int tahun, double hargaSewaPerHari) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.disewa = false;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public String getMerk() {
        return merk;
    }
    
    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public boolean isDisewa() {
        return disewa;
    }

    public void setDisewa(boolean disewa) {
        this.disewa = disewa;
    }
    
    @Override
    public String toString() {
        return String.format("Nopol: %s, Merk: %s %s (%d), Harga/hari: Rp%.0f, Status: %s",
                nomorPolisi, merk, model, tahun, hargaSewaPerHari, (disewa ? "Disewa" : "Tersedia"));
    }
}