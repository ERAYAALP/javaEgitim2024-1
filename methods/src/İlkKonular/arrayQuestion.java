package İlkKonular;

public class arrayQuestion {
    public static void main(String[] args) {
        double[] array = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        double toplam=0,tek=0,cift=0,ort=0;
        for (int i=0;i< array.length;i++)
        {
            toplam=toplam+array[i];
            if(array[i]%2==0)
            {
                cift=array[i]+cift;
            }
            else {
                tek=array[i]+tek;
            }


        }
        System.out.println("Dizideki sayıların toplamı: "+toplam);
        System.out.println("Dizideki çift sayıların toplamı: "+cift);
        System.out.println("Dizideki tek sayıların toplamı: "+tek);
        ort=toplam/ array.length;
        System.out.println("Ortalama: "+ort);


    }
}
