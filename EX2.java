//KDV TUTARI HESAPLAMA
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0.0;
        double rate = 18;
        System.out.println("Tutar giriniz:");
        price = scan.nextDouble();
        double kdvPrice = price * (rate/100);
        double total = price + kdvPrice;
        System.out.println(total);
    }
}
