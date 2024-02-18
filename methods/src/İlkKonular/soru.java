package İlkKonular;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam=0,sayac=0;
        double ortalama=0;
        while (true){
            System.out.println("Bir sayı giriniz: ");
            int sayi1=scanner.nextInt();
            if(sayi1==0){
                break;
            }
            else {
                sayac++;
                toplam+=sayi1;
            }
            ortalama= toplam/sayac;
        }
        System.out.println("Toplam: "+ toplam);
        System.out.println("Ortalama: "+ ortalama);
    }
}
