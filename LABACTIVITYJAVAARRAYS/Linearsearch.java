package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Scanner;

public class Linearsearch {
    static void problem(int[] arr, int target){
        for(int i = 0; i<= arr.length; i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target=sc.nextInt();
        problem(arr,target);
    }
}
