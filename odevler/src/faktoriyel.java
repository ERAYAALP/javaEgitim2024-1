import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        long faktoriyel=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyelinin hesaplanmasını istediğiniz sayıyı giriniz: ");
        int sayi=scanner.nextInt();
        while (sayi>0){
            faktoriyel*=sayi;
            sayi--;
        }
        System.out.println("Faktoriyel: "+faktoriyel);

    }
}
