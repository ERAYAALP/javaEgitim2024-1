package pdf6odev;

import java.util.Scanner;

public class question5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Pozitif bir sayı giriniz: ");
        sayi=scanner.nextInt();
        boolean deger=true;
        for (int i =2;i<sayi;i++)
        {
            if(sayi%2==0)
            {
                deger=false;
                break;
            }
        }
        if(deger &&sayi>1)
        {
            System.out.println(sayi+ " sayısı asaldır.");
        }
        else
        {
            System.out.println(sayi+ " sayısı asal değildir.");
        }
    }
}
