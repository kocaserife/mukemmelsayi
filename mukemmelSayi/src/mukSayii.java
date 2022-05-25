import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class mukSayii {

    public static void main(String[] args) {
// Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan
// sayıya mükemmel sayı denir.


        // 6 sayısı bölenleri 1 2 3 6 toplamı 12 yani kendisin eşit
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mukemmmel sayidir.");
        } else {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }


    }
}
