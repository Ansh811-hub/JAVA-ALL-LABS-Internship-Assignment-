package anudip.LAB4;

import java.util.Scanner;

// Superclass
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Objects Created Successfully!\n");

        System.out.println("Animal Sound:");
        animal.makeSound();

        System.out.println("\nDog Sound:");
        dog.makeSound();

        System.out.println("\nCat Sound:");
        cat.makeSound();

        sc.close();
    }
}