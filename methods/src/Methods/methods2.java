package Methods;

import java.util.Scanner;

//Kullanıcıdan kaç tane sayı girmek istediğini alınız. -> method
//daha sonra girieceği kadar sayıyı array'e atın -> method
//arrayde blunan sayıların toplamı ve ortalamasını bulun -> method
public class methods2 {
    public static void main(String[] args) {
        methods2 main1 = new methods2();
        int arrayLength = main1.getArrayLengthFromUser();
        int[] array = new int[arrayLength];
        array = main1.getNumbersFromUser(array);
        main1.calculateAverageAndSum(array);
    }
    public int getArrayLengthFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz?");
        int arrayLength = scanner.nextInt();
        return arrayLength;
    }
    public int[] getNumbersFromUser(int[] array) {
        Scanner scanner = new Scanner(System.in);
        int number;
        for(int i=0; i<array.length; i++) {
            System.out.println(i+1 + ". sayıyı giriniz :");
            number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    public void calculateAverageAndSum(int[] array) {
        int sum = 0;
        for(int number: array) {
            sum = sum + number;
        }
        System.out.println("Girdiğiniz sayıların toplamı : " + sum);
        System.out.println("Girdiğiniz sayıların toplamı : " + (double)sum/array.length);
    }
}