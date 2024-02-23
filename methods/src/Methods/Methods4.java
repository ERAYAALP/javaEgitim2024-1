package Methods;

import java.util.Random;
import java.util.Scanner;

public class Methods4 {
    public static void main(String[] args) {
        Methods4 methods4 = new Methods4();
        int zarSayisi = methods4.atilanZarSayisi();
        System.out.println("Atılması istenen zar sayısı: "+zarSayisi);
        int[] array = methods4.zar(zarSayisi);
        for(int toplam: array) {
            System.out.println(toplam);
        }
    }
    public int atilanZarSayisi()
    {
        int atilacakzarsayisi;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Zarın kaç kere atılmasını istiyorsunuz ?");
        atilacakzarsayisi= scanner.nextInt();
        return atilacakzarsayisi;
    }
    public int[] zar(int zarSayisi) {
        int zar1,zar2;
        Random random = new Random();
        int[] zarToplam = new int[zarSayisi];
        for(int i =1;i<=zarSayisi;i++)
        {
            zar1=random.nextInt(6)+1;
            zar2 =random.nextInt(6)+1;
            System.out.println("Atılan zar adedi: "+i+" "+"1. Zar1: "+zar1+" "+"2. Zar2: "+zar2);
            zarToplam[i-1] = zar1+zar2;
        }
        return zarToplam;
    }
}
