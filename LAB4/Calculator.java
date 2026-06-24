package anudip.LAB4;

import java.util.Scanner;

public class Calculator {

    int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }

    double sum(double a, double b){
        double sum = a + b;
        return sum;
    }
 public void main(String[] args){
     Scanner ab = new Scanner(System.in);
    int a  = ab.nextInt();
    int b = ab.nextInt();
    int c = ab.nextInt();

    int p = add(a,b);
    int q =add(a,b,c);
    double r =sum(a,b);

     System.out.println(p);
     System.out.println(q);
     System.out.println(r);
 }
}
