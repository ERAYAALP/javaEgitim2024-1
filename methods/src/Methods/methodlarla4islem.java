package Methods;

import java.util.Scanner;

public class methodlarla4islem {
    public static void main(String[] args) {
        int number1,number2;
        Scanner scanner  =new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        number1=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        number2=scanner.nextInt();
        toplama(number1,number2);
        cikarma(number1,number2);
        carpma(number1,number2);
        bolme(number1,number2);


        }
        public static void toplama(int s1,int s2)
        {
           int  toplam=s1+s2;
            System.out.println("İki sayının toplamı: " +toplam);

        }
        public static void cikarma(int s1,int s2){
        int cikan=s1-s2;
            System.out.println("İki sayının farkı: " +cikan);
        }
        public static void carpma(int s1,int s2)
        {
           int carpma=s1*s2;
            System.out.println("İki sayının çarpımı: "+ carpma);

        }
        public static void bolme(int s1,int s2){
        int bolme=s1/s2;
            System.out.println("İki sayının bölümü: " +bolme);
        }
    }
