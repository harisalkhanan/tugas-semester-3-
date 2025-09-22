
public class Main {
    public static void main(String[] args) {
     
        BangunRuang[] koleksiBangunRuang = new BangunRuang[2];

        koleksiBangunRuang[0] = new Balok(10, 5, 6);
        koleksiBangunRuang[1] = new Kubus(7);

        for (BangunRuang bangun : koleksiBangunRuang) {

            if (bangun instanceof Balok) {
                System.out.println("===== Hasil Perhitungan BALOK =====");
            } else if (bangun instanceof Kubus) {
                System.out.println("===== Hasil Perhitungan KUBUS =====");
            }

            System.out.println("Volume          : " + bangun.hitungVolume());
            System.out.println("Luas Permukaan  : " + bangun.hitungLuasPermukaan());
            System.out.println();
        }
    }
}