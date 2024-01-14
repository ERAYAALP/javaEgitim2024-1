import java.util.Scanner;

public class arrayexamples {
    public static void main(String[] args)
    {
        int sayi;
        int toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı gir: ");
        sayi= scan.nextInt();
        toplam+=sayi;
        while (true)
        if(sayi==0) {
            System.out.println("0 sayısını girdiğiniz için girilen sayıların toplamı hesaplanıyor.");
            break;
        }
        System.out.println("0 Girilene kadar girilen sayıların toplamı: "+toplam);
    }
}
