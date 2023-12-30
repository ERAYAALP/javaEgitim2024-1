import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sayi1;
        int sayi2;
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1=scan.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2= scan.nextInt();
        System.out.println("Girilen iki sayının toplamı: "+(sayi1+sayi2));
        System.out.println("Girinlen iki sayının farkı: "+(sayi1-sayi2));
        System.out.println("Girilen iki sayının çarpımı: "+(sayi1*sayi2));
        System.out.println("Girilen iki sayının bölümü: "+(sayi1/sayi2));


    }4
}