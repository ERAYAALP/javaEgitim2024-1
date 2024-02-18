package İlkKonular;

import java.util.Scanner;

public class algortihms4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2=scanner.nextInt();
        if(sayi1>sayi2){
            System.out.println("sayı2 küçüktür.");
        }
        else if(sayi1<sayi2){
            System.out.println("sayı1 küçüktür.");
        }
        else
        {
            System.out.println("Sayı1 ve sayı2 eşittir.");
        }

    }
}
