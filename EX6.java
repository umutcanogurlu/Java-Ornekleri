public class EX6 {
    public static void main(String[] args) {
        int toplam = 0;
        int sinir = 10;

        for (int i = 1; i <= sinir; i++) {
            if (i % 2 != 0) {
                toplam += i;
            }
        }

        System.out.println("Tek sayıların toplamı: " + toplam);
    }
}
