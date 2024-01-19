package pdf6Tekrar;

import java.util.Scanner;

public class fortekrar {
    public static void main(String[] args)
    {
        int sayi,sayac=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        sayi=scanner.nextInt();
        for (int i= 1; i<=sayi;i++){
            if (i%2==0){
                sayac++;
            }
        }
        System.out.println("1'den başlayarak girmiş olduğunuz "+sayi+" değerine kadar " +sayac+ " çift sayı vardır.");
    }
}
