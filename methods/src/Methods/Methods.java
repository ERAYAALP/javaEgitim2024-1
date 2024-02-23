package Methods;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Methods methods = new Methods();
        int toplam = methods.getUserGuessNumber();
        methods.zar(toplam);
    }
    public int getUserGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("4 ile 24 arasında bir sayı giriniz: ");
            number = scanner.nextInt();
        } while (number < 4 && number > 24);
        return number;
    }
    public void zar(int toplam) {
        int deneme = 0;
        int zar1, zar2;
        Random random = new Random();
        while (true) {
            deneme++;
            zar1 = random.nextInt(6) + 1;
            zar2 = random.nextInt(6) + 1;
            if ((zar1 + zar2)*2 == toplam) {
                if (deneme == 1 || deneme == 2) {
                    System.out.println("Tebrikler 3m dolar kazandınız.");
                } else if (deneme >= 3 && deneme <= 6) {
                    System.out.println("Tebrikler 1m dolar kazandınız.");
                } else if (deneme >= 7 && deneme <= 10) {
                    System.out.println("Tebrikler 500 bin dolar kazandınız. ");
                } else
                {
                    System.out.println("Tebrikler 50 dolar kazandınız.");
                }
                break;
            }
            if(toplam%2!=0)
            {
                System.out.println("Tebrikler 50 dolar kazandınız.");
                break;
            }
        }
    }
}

