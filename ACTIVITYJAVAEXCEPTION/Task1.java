package anudip.ACTIVITYJAVAEXCEPTION;
// Objective

//To understand and implement exception handling in Java using try, catch, and finally
//blocks.


import java.util.Scanner;

// Task 1: Handle Arithmetic Exception
public class Task1 {
    static int problem(int a, int b){
        try{
            int div = a/b;
        }catch(ArithmeticException e) {
            System.out.println("Division by zero");
        }
        return 0;
    }

    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int q;

         q = problem(a,b);
        System.out.println(q);
    }
}
