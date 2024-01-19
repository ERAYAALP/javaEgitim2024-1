package pdf6odev;

import java.util.Scanner;

public class question4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int faktoriyel=1;
        System.out.println("Faktoriyelinin hesaplanmasını istediğiniz sayıyı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i<=sayi;i++){
            faktoriyel=faktoriyel*i;
            System.out.println(faktoriyel);
    }
        System.out.println(sayi+"!="+faktoriyel);

    }
}
