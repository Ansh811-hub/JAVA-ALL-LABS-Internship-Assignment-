package anudip.Session3LAB;

import java.util.Scanner;

public class Car {
  private String make;
    private String model;
    private int price;
    private short year;

    Car(String make, String model, int price, short year) {
        System.out.println(make + " " + model + " " + price + " " + year);
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Car Car = new  Car(sc.next(), sc.next(), sc.nextInt(), sc.nextShort());
        Car.make = sc.nextLine();
        Car.model = sc.nextLine();
        Car.price = sc.nextInt();
        Car.year = sc.nextShort();
        sc.close();
    }
    }

