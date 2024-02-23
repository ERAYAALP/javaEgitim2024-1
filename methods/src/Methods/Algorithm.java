package Methods;

import java.util.Random;
import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        int userGuessNumber = algorithm.getUserGuessNumber();
        algorithm.matchNumberWithUserGuessNumber(userGuessNumber);
    }
    public int getUserGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("1 ve 100 arasında bir sayı giriniz: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        return number;
    }
    public void matchNumberWithUserGuessNumber(int userGuessNumber) {
        Random random=new Random();
        int randomNumberForUser;
        int sayac = 0;
        while(true) {
            randomNumberForUser = random.nextInt(100) + 1;
            sayac++;
            if(randomNumberForUser == userGuessNumber) {
                if(sayac == 1) {
                    System.out.println("Tebrikler 100M dolar kazandınız..");
                }else if(sayac >1 && sayac <= 30) {
                    System.out.println("Tebrikler 5M dolar kazandınız..");
                }else if(sayac > 30 && sayac <= 50) {
                    System.out.println("Tebrikler 1M dolar kazandınız..");
                }else {
                    System.out.println("Üzgünüm hiç bişey kazanamadınız.");
                }
                break;
            }
        }
    }
}