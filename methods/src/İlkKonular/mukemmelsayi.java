package İlkKonular;

import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi = 0, toplam = 0;

        while (true) {
            System.out.println("Mükemmel sayı olup olmadığını kontorl etmek istediğiniz sayıyı giriniz: ");
            sayi = scanner.nextInt();
            for (int i = 1; i <= sayi; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        toplam = toplam + j;
                    }
                }
                if (toplam == i)
                {
                    System.out.println(sayi + " sayısı mükemmel sayıdır. ");
                }
                else
                {
                    System.out.println(sayi+ "bu sayı mükemmel sayı değildir.");
                }
                toplam = 0;

            }

        }
    }
}
