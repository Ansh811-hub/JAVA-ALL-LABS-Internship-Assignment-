package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    void fill(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n= 3;
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        Arrays.fill(arr, 10);
        fill(arr);
    }
}
