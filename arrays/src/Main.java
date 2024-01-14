import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Random r = new Random();
        int[] dizi=new int[50];
        double toplam=0,ort = 0;
        for(int i=0;i<=50;i++)
        {
            dizi[20]=r.nextInt();
            toplam+=i;
            ort=toplam/i;
        }
        System.out.println(toplam);
        System.out.println(ort);


    }
}