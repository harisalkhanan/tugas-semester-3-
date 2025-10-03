
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static List<Penyewa> daftarPenyewa = new ArrayList<>();
    private static List<Transaksi> daftarTransaksi = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasiData();

        int pilihan = 0;
        while (pilihan != 5) {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahKendaraan();
                    break;
                case 2:
                    tambahPenyewa();
                    break;
                case 3:
                    lakukanPenyewaan();
                    break;
                case 4:
                    tampilkanSemuaData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem kami. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }
    }

    public static void tampilkanMenu() {
        System.out.println("===== SISTEM PENYEWAAN KENDARAAN =====");
        System.out.println("1. Tambah Data Kendaraan");
        System.out.println("2. Tambah Data Penyewa");
        System.out.println("3. Lakukan Penyewaan Kendaraan");
        System.out.println("4. Tampilkan Semua Data");
        System.out.println("5. Keluar");
        System.out.println("======================================");
    }

    public static void tambahKendaraan() {
        System.out.println("\n--- Tambah Kendaraan Baru ---");
        System.out.print("Nomor Polisi: ");
        String nopol = scanner.nextLine();
        System.out.print("Merk: ");
        String merk = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Harga Sewa per Hari: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        daftarKendaraan.add(new Kendaraan(nopol, merk, model, tahun, harga));
        System.out.println("Data kendaraan berhasil ditambahkan!");
    }

    public static void tambahPenyewa() {
        System.out.println("\n--- Tambah Penyewa Baru ---");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String noTelp = scanner.nextLine();

        daftarPenyewa.add(new Penyewa(nama, noTelp));
        System.out.println("Data penyewa berhasil ditambahkan!");
    }

    public static void lakukanPenyewaan() {
        System.out.println("\n--- Lakukan Penyewaan ---");
        System.out.println("Daftar Kendaraan Tersedia:");
        boolean adaYangTersedia = false;
        for (int i = 0; i < daftarKendaraan.size(); i++) {
            if (!daftarKendaraan.get(i).isDisewa()) {
                System.out.println((i + 1) + ". " + daftarKendaraan.get(i));
                adaYangTersedia = true;
            }
        }
        
        if (!adaYangTersedia) {
            System.out.println("Maaf, tidak ada kendaraan yang tersedia saat ini.");
            return;
        }

        System.out.print("Pilih nomor kendaraan yang akan disewa: ");
        int pilihanKendaraan = scanner.nextInt() - 1;

        System.out.println("\nDaftar Penyewa:");
        for (int i = 0; i < daftarPenyewa.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPenyewa.get(i));
        }
        System.out.print("Pilih nomor penyewa: ");
        int pilihanPenyewa = scanner.nextInt() - 1;
        
        System.out.print("Lama sewa (hari): ");
        int lamaSewa = scanner.nextInt();
        scanner.nextLine();

        if (pilihanKendaraan >= 0 && pilihanKendaraan < daftarKendaraan.size() &&
            pilihanPenyewa >= 0 && pilihanPenyewa < daftarPenyewa.size()) {
            
            Kendaraan kendaraanDipilih = daftarKendaraan.get(pilihanKendaraan);
            Penyewa penyewaDipilih = daftarPenyewa.get(pilihanPenyewa);

            if (kendaraanDipilih.isDisewa()) {
                System.out.println("Maaf, kendaraan tersebut sudah disewa.");
                return;
            }

            Transaksi transaksiBaru = new Transaksi(penyewaDipilih, kendaraanDipilih, lamaSewa);
            daftarTransaksi.add(transaksiBaru);

            System.out.println("\nTransaksi berhasil dibuat!");
            System.out.println(transaksiBaru);

        } else {
            System.out.println("Pilihan kendaraan atau penyewa tidak valid.");
        }
    }
    
    public static void tampilkanSemuaData() {
        System.out.println("\n--- DATA KENDARAAN ---");
        if (daftarKendaraan.isEmpty()) {
            System.out.println("Tidak ada data kendaraan.");
        } else {
            for (Kendaraan k : daftarKendaraan) {
                System.out.println(k);
            }
        }
        
        System.out.println("\n--- DATA PENYEWA ---");
        if (daftarPenyewa.isEmpty()) {
            System.out.println("Tidak ada data penyewa.");
        } else {
            for (Penyewa p : daftarPenyewa) {
                System.out.println(p);
            }
        }
        
        System.out.println("\n--- DATA TRANSAKSI ---");
        if (daftarTransaksi.isEmpty()) {
            System.out.println("Tidak ada data transaksi.");
        } else {
            for (Transaksi t : daftarTransaksi) {
                System.out.println(t);
            }
        }
    }
    
    public static void inisialisasiData() {
     
        daftarKendaraan.add(new Kendaraan("B 1234 ABC", "Toyota", "Avanza", 2022, 300000));
        daftarKendaraan.add(new Kendaraan("D 5678 XYZ", "Honda", "Brio", 2023, 250000));
        daftarKendaraan.add(new Kendaraan("F 9101 GHI", "Suzuki", "Ertiga", 2021, 280000));

        daftarPenyewa.add(new Penyewa("Budi Santoso", "081234567890"));
        daftarPenyewa.add(new Penyewa("Citra Lestari", "087712345678"));
    }
}