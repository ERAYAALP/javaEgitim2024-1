package Polymophism_Example01;

public class Abstract_Example01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Horse horse = new Horse();
        horse.makeSound();
    }
     abstract class Animal {
        public abstract void makeSound();
    }
     class Cat extends Animal
    {
        @Override
        public void makeSound() {
            System.out.println("Kedi miyavlıyor.");
        }
    }
     class Dog extends Animal{
        @Override
        public void makeSound() {
            System.out.println("Köpek havlıyor.");
        }
    }
     class Horse extends Animal
    {
        @Override
        public void makeSound() {
            System.out.println("At kişniyor.");
        }
    }
}
