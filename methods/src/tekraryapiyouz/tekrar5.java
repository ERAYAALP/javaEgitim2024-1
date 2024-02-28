package tekraryapiyouz;

public class tekrar5 {
    //alınan ürün: 12kg leblebi , birim fiyatı:3.5TL
    //40 kg badem, birim fiyatı:22 TL
    //25 kg fındık, birim fiyatı: 15.70
    //kar oranı: leblebi %50 , fındık %40, badem %60
    //dükkan kirası=2000TL, ciro ile kira ödenebiliyor mu ?

    public static double Leblebi(double leblebi, double leblebiMaliyet,double karOraniLeblebi)
    {
        double toplamLeblebiMaliyeti=leblebi*leblebiMaliyet;
        System.out.println("12 KG Leblebinin dükkana maliyeti: "+toplamLeblebiMaliyeti);
        double karLeblebi=toplamLeblebiMaliyeti*karOraniLeblebi;
        System.out.println("12 KG Leblebinin karı ile satılmış hali: "+ karLeblebi);
        return karLeblebi;
    }
    public static double Badem(double badem, double bademMaliyet, double karOraniBadem)
    {
        double toplamBademMaliyeti=badem*bademMaliyet;
        System.out.println("40 KG Bademin dükkana maliyeti: "+toplamBademMaliyeti);
        double karBadem=toplamBademMaliyeti*karOraniBadem;
        System.out.println("40 KG Bademin karı ile satılmış hali: "+ karBadem);
        return karBadem;
    }
    public static double Findik(double findik, double findikMaliyet,double karOraniFindik)
    {
        double toplamFindikMaliyet=findikMaliyet*findik;
        System.out.println("25 KG Fındığın dükkana maliyeti: "+toplamFindikMaliyet);
        double karFindik=toplamFindikMaliyet*karOraniFindik;
        System.out.println("25 KG Fındığın kar ile satışmış hali: "+karFindik);
        return karFindik;
    }
    public static void main(String[] args) {
        double leb, bad, fin;
        tekrar5 tekrar5 = new tekrar5();
        leb = Leblebi(12,3.5,1.5);
        bad=Badem(40,22,1.6);
        fin=Findik(25,15.7,1.4);
        int kira=2100;
        double ciro=leb+bad+fin;
        if(ciro>kira)
        {
            System.out.println(" Toplam cironuz: " +ciro+ " Toplam kazancınız ile kiranızı ödeyebilirsiniz.");
        }
        else
        {
            System.out.println("Kirayı ödeyemediniz.");
        }
    }
}
