package pdf6odev;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Pozitif bir sayı giriniz: ");
        sayi=scanner.nextInt();
        for (int i =1; i<=10;i++)
        {
            System.out.println(sayi+" x " + i + " = " + (sayi*i));
        }
    }
}
