import java.util.Scanner;

//DAİRE ALAN VE ÇEVRE HESAPLAMA
public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçap değerini giriniz:");
        int r = scanner.nextInt();
        double alan = Math.PI * r * r;
        double cevre = 2 * Math.PI * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

    }
}
