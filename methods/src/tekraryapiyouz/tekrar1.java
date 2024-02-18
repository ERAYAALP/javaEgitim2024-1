package tekraryapiyouz;

import java.util.Scanner;

public class tekrar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,toplam=0;
        System.out.println("Sıfırdan farklı bir sayı giriniz: ");
        sayi1= scanner.nextInt();
        if(sayi1==0){
            System.out.println("Sıfırdan farklı bir sayı giriniz: " + " Girilen sayı: "+sayi1);
            return;
        }
        System.out.println("Sıfırdan farklı bir sayı giriniz: ");
        sayi2=scanner.nextInt();
        if (sayi2==0){
            System.out.println("Sıfırdan farklı bir sayı giriniz: " + " Girilen sayı: "+sayi2);
            return;
        }
        System.out.println("Girilen sayıların toplamı: "+(toplam=sayi2+sayi1));

    }
}
