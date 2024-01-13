import java.util.Scanner;

public class tekcift2 {
    public static void main(String[] args) {
        int sayi;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayı giriniz: ");
        sayi= scan.nextInt();
        if (sayi<=0)
        {
            System.out.println("Lütfen pozitif bir sayı giriniz: ");
        }
        else {
            for (int i=1;i<=sayi;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i+"sayısı çifttir.");
                }
                else {
                    System.out.println(i+"sayısı tektir.");
                }
            }
        }
    }
}
