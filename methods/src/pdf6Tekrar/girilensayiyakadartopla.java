package pdf6Tekrar;

import java.util.Scanner;

public class girilensayiyakadartopla {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int sayi1,sonuc;
        System.out.println("Bir sayı giriniz: ");
        sayi1=scanner.nextInt();
        sonuc = hesapla(sayi1);
        System.out.println(sayi1+ " girilen sayıya kadar olan sayıların toplamı: " +sonuc);

    }
    public static int hesapla(int sayi1){
        int toplam=0;
        for (int i=1;i<=sayi1;i++)
        {
            toplam=toplam+i;
        }
        return toplam;
    }
}


