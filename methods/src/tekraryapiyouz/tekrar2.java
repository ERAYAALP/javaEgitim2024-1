package tekraryapiyouz;

import java.util.Scanner;

public class tekrar2 {
    public static void main(String[] args) {
        double sayi1,sayi2,toplam=0;
        double ort;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi1= scanner.nextInt();
        System.out.println("Bir sayı giriniz: ");
        sayi2= scanner.nextInt();
        System.out.println("Girilen sayıların toplamı :"+(double)(toplam=sayi1+sayi2));
        System.out.println("Girilen sayıların ortalaması: "+(double)(ort=(sayi1+sayi2)/2));
    }
}
