package tekraryapiyouz;

public class tekrar4 {
    public void islem()
    {
        int toplam=0;
        double ortalama=0;
        int[] sayilar = {2,-9,5,12,-25,22,9,8,12};
        for (int i=0;i<sayilar.length;i++)
        {
            toplam=toplam+sayilar[i];
        }
        ortalama=toplam/sayilar.length;
        System.out.println(ortalama);
        System.out.println(toplam);
    }

    public static void main(String[] args) {
        tekrar4 tekrar4=new tekrar4();
        tekrar4.islem();
    }
}
