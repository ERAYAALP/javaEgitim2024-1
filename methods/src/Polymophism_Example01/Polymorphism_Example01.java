package Polymophism_Example01;

public class Polymorphism_Example01 {

    public static int sum(int number1,int number2)
    {
        return number1+number2;
    }
    public static int sum(double number1, int number2)
    {
        return (int) (number1*number2);
    }
    public static int sum(int number1, float number2)
    {
        return (int) (number1-number2);
    }
    public static void main(String[] args)
    {
        Polymorphism_Example01.sum(4,5);
        Polymorphism_Example01.sum(3.0,8);
        Polymorphism_Example01.sum(10,4);
        System.out.println(Polymorphism_Example01.sum(4,5));
    }
}
