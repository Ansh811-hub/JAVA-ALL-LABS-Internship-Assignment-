package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Scanner;

public class Acceptarrayelements {
    static int problem(int [] arr){
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        return 0;
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] arr =new int[n];
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        int p = problem(arr);
        System.out.println(p);

    }
}
