import java.util.Scanner;
public class hizceza {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int hiz;
        int ceza;
        System.out.println("Hızınızı giriniz: ");
        hiz=scan.nextInt();

        if(hiz<=50)
        {
            ceza=hiz*2;
            System.out.println("Ödenecek tutar: " +ceza);
        }else if (50<hiz && 70>=hiz)
        {
            ceza=hiz/2;
            System.out.println("Ödenecek tutar: " +ceza);
        } else if (70<hiz && 85>=hiz)
        {
            ceza=hiz;
            System.out.println("Ödenecek tutar: " +ceza);
        } else if (hiz>85)
        {
            ceza=hiz*3;
            System.out.println("Ödenecek tutar: " +ceza);

        }


    }
}
