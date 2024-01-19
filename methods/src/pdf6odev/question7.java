package pdf6odev;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enbuyuk = 0;
        int enkucuk = 0;
        int sayi;
        char sec = 0;
        do {
                System.out.println("Bir sayı giriniz: ");
                sayi = scanner.nextInt();

                if (sayi > enbuyuk)
                {
                    enbuyuk = sayi;
                } else if (sayi < enkucuk)
                {
                    enbuyuk = sayi;
                }
                System.out.print("Devam etmek istiyor musunuz? y/n?");
                sec = scanner.next().charAt(0);
            }while (sec=='y'||sec=='Y');
        System.out.println("En büyük sayı: "+ enbuyuk);
        }
    }


