public class Nilai {
    // Variabel untuk menyimpan data mahasiswa
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;

    // Method untuk mencetak semua nilai
    public void CetakNilai() {
        // Menghitung nilai akhir berdasarkan bobot
        // Absen: 10%, Tugas: 20%, UTS: 30%, UAS: 40% (asumsi)
        double nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.40);

        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Nilai Absen[10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas[20%] : " + nilaiTugas);
        System.out.println("Nilai UTS[30%]   : " + nilaiUTS);
        System.out.println("Nilai UAS[40%]   : " + nilaiUAS);
        System.out.println("Nilai Akhir      : " + nilaiAkhir);
    }
}