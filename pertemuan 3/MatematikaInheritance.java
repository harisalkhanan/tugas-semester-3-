public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 m = new Matematika2();

        int a = 10, b = 3;

        System.out.println("Penjumlahan: " + m.tambah(a, b));
        System.out.println("Pengurangan: " + m.kurang(a, b));
        System.out.println("Perkalian: " + m.kali(a, b));
        System.out.println("Pembagian: " + m.bagi(a, b));
        System.out.println("Modulus: " + m.modulus(a, b));
    }
}
