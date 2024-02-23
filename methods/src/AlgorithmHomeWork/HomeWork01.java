package AlgorithmHomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args)
    {
        int tekrarSayisi =10;
        int sayac=0;
        int aHarfi=0;
        String tekrarEdecekKelime="ErayAlp";
        char tekrarEdecekHarf[]=tekrarEdecekKelime.toCharArray();
        int harf = tekrarEdecekHarf.length;
        char harfler[] = new char[tekrarSayisi];
        for (int i=0;i<tekrarSayisi;i++)
        {
            harfler[i]=tekrarEdecekHarf[sayac];
            if(tekrarEdecekHarf[sayac]=='a')
            {
                aHarfi++;
            }
            sayac++;
            if(sayac==harf)
            {
                sayac=0;
            }
        }
        System.out.println(Arrays.toString(harfler));
        System.out.println(aHarfi+" kere tekrar etmiştir.");
    }
}