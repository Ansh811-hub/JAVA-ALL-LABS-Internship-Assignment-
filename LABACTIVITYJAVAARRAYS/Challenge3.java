package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge3 {
    void duplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i ==  arr.length-2){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        Challenge3 c = new Challenge3();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        c.duplicate(arr);
    }
}
