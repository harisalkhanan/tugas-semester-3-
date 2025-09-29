import java.util.Scanner;

public class HitungNilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String npm, namaMahasiswa;
        double nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        char grade;
        String keterangan;

        System.out.println("======================================");
        System.out.println("       PROGRAM HITUNG NILAI AKHIR     ");
        System.out.println("======================================");

        System.out.print("NPM             : ");
        npm = input.nextLine();

        System.out.print("Nama Mahasiswa  : ");
        namaMahasiswa = input.nextLine();

        System.out.print("Nilai Kehadiran : ");
        nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas     : ");
        nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS       : ");
        nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS       : ");
        nilaiUAS = input.nextDouble();

        nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        if (nilaiAkhir >= 76 && nilaiAkhir <= 100) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 75) {
            grade = 'B';
            keterangan = "BAIK";
        } else if (nilaiAkhir >= 56 && nilaiAkhir <= 65) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir >= 46 && nilaiAkhir <= 55) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }

        System.out.println("\n======================================");
        System.out.println("          HASIL NILAI MAHASISWA       ");
        System.out.println("======================================");
        System.out.println("NPM Mahasiswa   : " + npm);
        System.out.println("Nama Mahasiswa  : " + namaMahasiswa);
        System.out.println("Nilai Rata-rata : " + String.format("%.2f", nilaiAkhir)); 
        System.out.println("Grade           : " + grade);
        System.out.println("Keterangan      : " + keterangan);
        System.out.println("======================================");

        input.close();
    }
}