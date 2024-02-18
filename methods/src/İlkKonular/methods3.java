package İlkKonular;

public class methods3 {
    public static void main(String[] args) {
        methods3 methods3 = new methods3();
        methods3.tekCift();

    }

    public void tekCift() {
        int tek = 0, cift = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                tek = tek + i;

            } else
            {
                cift = cift + i;
            }

        }
        System.out.println("Çift sayıların toplamı: " + cift);
        System.out.println("Tek sayıların toplamı: " + tek);
    }
}

