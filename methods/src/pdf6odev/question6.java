package pdf6odev;

import java.util.Scanner;

public class question6 {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int sayi,pozitif=0,negatif=0,sifir=0;
        char sec;
        do
        {
            System.out.println("Bir sayı giriniz: ");
            sayi=scanner.nextInt();

            if(sayi>0)
            {
                //System.out.println("Girilen sayı pozitiftir. "+ sayi);
                pozitif++;
            }
            else if(sayi<0)
            {
                //System.out.println("Girilen sayı negatiftir. "+sayi);
                negatif++;
            }
            else
            {
                //System.out.println("Girilen sayı 0'a eşittir. "+sayi);
                sifir++;
            }
            System.out.print("Devam etmek istiyor musunuz? y/n?");
            sec=scanner.next().charAt(0);

        }while (sec=='y'|| sec=='Y');
        System.out.println("Pozitif sayılar: "+pozitif);
        System.out.println("Negatif sayılar: "+negatif);
        System.out.println("Sıfır: "+sifir);

    }
}
