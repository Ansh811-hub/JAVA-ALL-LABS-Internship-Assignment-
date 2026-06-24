package anudip;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float average;
        System.out.println("enter first no : ");
        int n = sc.nextInt();
        System.out.println("enter second no : ");
        int o = sc.nextInt();
        System.out.println("enter third no : ");
        int p = sc.nextInt();
        System.out.println("enter fourth no : ");
        int q = sc.nextInt();
        System.out.println("enter fifth no : ");
        int r = sc.nextInt();

        average = (n+o+p+q+r)/5;
        System.out.println("average is "+average);
        sc.close();
    }
}
