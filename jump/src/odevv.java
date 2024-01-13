import java.util.Scanner;

public class odevv {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Bir sayı giriniz: ");
                int sayi = scanner.nextInt();
                int sayac = 0;

                for (int i = sayi; i >= 1; i--) {
                    if (i % 2 == 0) {
                        sayac++;
                    }
                }
                System.out.println(sayac);
            }
        }

