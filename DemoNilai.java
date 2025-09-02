public class DemoNilai {
    public static void main(String[] args) {
        // 1. Membuat objek baru dari class Nilai
        Nilai dataMahasiswa = new Nilai();

        // 2. Mengisi variabel (memberi nilai) pada objek
        dataMahasiswa.nim = "2410631170024";
        dataMahasiswa.nama = "Haris al khanan";
        dataMahasiswa.nilaiAbsen = 100; // nilai 0-100
        dataMahasiswa.nilaiTugas = 90;
        dataMahasiswa.nilaiUTS = 85;
        dataMahasiswa.nilaiUAS = 88;

        // 3. Memanggil method untuk mencetak hasil
        dataMahasiswa.CetakNilai();
    }
}