import java.util.Scanner;

public class jump {
    public static void main(String[] args) {
        int hak=3;
        int sifre=1234;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Şifrenizi giriniz: ");
            sifre = scanner.nextInt();
            if (sifre == 1234) {
                System.out.println("Hoşgeldiniz.");
                break;
            } else {
                hak--;

                if (hak > 0) {
                    System.out.println("Kalan şifre giriş hakkınız: " + hak);
                } else {
                    System.out.println("Hesabınız bloke olmuştur.");
                }
            }
        }while (hak>0);
    }
    }

