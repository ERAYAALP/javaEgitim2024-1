package İlkKonular;

import java.util.Scanner;

public class algortihm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ort;
        System.out.println("Birinci sayıyı giriniz: ");
        double sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        double sayi2 = scanner.nextInt();
        double toplam = sayi2+sayi1;
        System.out.println("Sayıların toplamı: "+toplam);
        System.out.println("Girilen sayıların ortalaması: "+(double)(ort=toplam/2));

    }
}
