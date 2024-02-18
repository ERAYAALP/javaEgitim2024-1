package İlkKonular;

import java.util.Scanner;

public class algortihms2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2,toplam;
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1=scanner.nextInt();
        if(sayi1==0)
        {
            System.out.println("Sıfırdan farklı bir sayı giriniz: ");
            return;

        }
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2=scanner.nextInt();
        if (sayi2==0)
        {
            System.out.println("Sıfırdan farklı bir sayı giriniz: ");
            return;
        }
        System.out.println("Girilen sayıların toplamı: "+(sayi1+sayi2));

    }
}
