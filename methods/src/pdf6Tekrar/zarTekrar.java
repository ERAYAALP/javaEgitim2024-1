package pdf6Tekrar;

import java.util.Random;

public class zarTekrar {
    public static void main(String[] args) {
        int zar1,zar2,deneme=1;
        Random random=new Random();
        while (true)
        {
            zar1=random.nextInt(6)+1;
            zar2=random.nextInt(6)+1;
            if(zar1==6 && zar2==6)
            {
                System.out.println(deneme+ "."+"denemede zarların ikisi de 6");
                break;
            }
            else {
                System.out.println("Atılan ilk zar: " +zar1+ "Atılan ikinci zar"+zar2);
            }
            deneme++;
        }
    }
}
