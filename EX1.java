//not ortalaması hesaplayan kod
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fizik,matematik,turkce,kimya,muzik,tarih,sonuc;
        System.out.println("Fizik notunuz:");
        fizik = input.nextInt();
        System.out.println("Matematik notunuz:");
        matematik = input.nextInt();
        System.out.println("Türkçe notunuz:");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz:");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz:");
        muzik = input.nextInt();
        System.out.println("Tarih notunuz:");
        tarih = input.nextInt();
        sonuc = (fizik+matematik+turkce+kimya+muzik+tarih)/6;
        System.out.println("Ortalamanız:" + sonuc);





    }
}
