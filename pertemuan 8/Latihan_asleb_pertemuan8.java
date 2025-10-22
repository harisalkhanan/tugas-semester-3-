import java.util.Scanner;

public class Latihan_asleb_pertemuan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Data Buku
        Book[] koleksi = new Book[5];
        koleksi[0] = new Book("Cara memasak", "Raihan", "1930", false);
        koleksi[1] = new Book("Bumi Manusia", "Pramoedya Ananta Toer", "1980", false);
        koleksi[2] = new Book("Laskar Pelangi", "Andrea Hiratai", "2005", false);
        koleksi[3] = new Book("Filosofi Teras", "Henry Manamping", "2018", false);
        koleksi[4] = new Book("Madilo", "Tan Malaka", "1943", false);

        int pilihan;

        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Book");
            System.out.println("2. Cari Book berdasarkan judul");
            System.out.println("3. Pinjam Book");
            System.out.println("4. Kembalikan Book");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\nDaftar Buku:");
                    for (Book b : koleksi) {
                        b.tampilkanDataBuku();
                        System.out.println("--------------------");
                    }
                    break;

                case 2:
                    System.out.print("Masukkan judul buku yang dicari: ");
                    String cariJudul = input.nextLine();
                    boolean ditemukan = false;
                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(cariJudul)) {
                            b.tampilkanDataBuku();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String pinjamJudul = input.nextLine();
                    boolean dipinjam = false;
                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(pinjamJudul)) {
                            if (!b.isBooked) {
                                b.isBooked = true;
                                System.out.println("Buku berhasil dipinjam!");
                            } else {
                                System.out.println("Buku sudah dipinjam orang lain.");
                            }
                            dipinjam = true;
                            break;
                        }
                    }
                    if (!dipinjam) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                    String kembaliJudul = input.nextLine();
                    boolean dikembalikan = false;
                    for (Book b : koleksi) {
                        if (b.judul.equalsIgnoreCase(kembaliJudul)) {
                            if (b.isBooked) {
                                b.isBooked = false;
                                System.out.println("Buku berhasil dikembalikan!");
                            } else {
                                System.out.println("Buku ini belum dipinjam.");
                            }
                            dikembalikan = true;
                            break;
                        }
                    }
                    if (!dikembalikan) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
