public class Book {
    public String judul;
    public String penulis;
    public String tahunTerbit;
    public boolean isBooked;

    public Book(String judul, String penulis, String tahunTerbit, boolean isBooked) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isBooked = isBooked;
    }

    public void tampilkanDataBuku() {
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Penulis\t\t: " + penulis);
        System.out.println("Tahun terbit\t: " + tahunTerbit);
        System.out.println(isBooked ? "Buku telah dipinjam" : "Buku belum dipinjam");
    }
}
