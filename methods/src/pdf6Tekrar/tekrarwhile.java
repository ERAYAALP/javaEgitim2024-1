package pdf6Tekrar;

import java.util.Scanner;

public class tekrarwhile {
    public static void main(String[] args) {
        int start;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        start=scanner.nextInt();


        while (true)
        {
            System.out.println("Start: "+ start);
            start++;
            if (start > 5) {
                break;
            }
        }
    }
}
