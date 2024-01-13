public class yildiz {
    public static void main(String[] args) {
        int[] sayilar={2,-9,0,5,12,-25,22,9,8,12};
        int toplam=0 ,ort;
        for(int i:sayilar)
        {
            toplam+=i;
        }
        ort=toplam/sayilar.length;
        System.out.println("Toplam: "+toplam);
        System.out.println("Ortlama: "+ ort);
    }
}
