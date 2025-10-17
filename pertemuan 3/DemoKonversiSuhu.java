public class DemoKonversiSuhu {
    public static void main(String[] args) {
        KonversiSuhu2 k = new KonversiSuhu2();

        double c = 25; // suhu dalam Celcius
        double f = 77; // suhu dalam Fahrenheit

        System.out.println("=== Konversi Suhu ===");
        System.out.println("Celcius ke Fahrenheit: " + k.celciusToFahrenheit(c));
        System.out.println("Celcius ke Reamur: " + k.celciusToReamur(c));
        System.out.println("Fahrenheit ke Reamur: " + k.fahrenheitToReamur(f));
    }
}
