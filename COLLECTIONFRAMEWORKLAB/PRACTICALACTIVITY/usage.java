package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class usage{
    void display(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println("after sorting");
        System.out.println("array to string");
        Arrays.toString(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
      int r = Arrays.binarySearch(arr,30);
        System.out.println("index of 30 is "+r);
    }

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = 5;
        int [] arr = new int[n];
        arr = new int[]{50,20,80,10,30};
        display(arr);
        sort(arr);
    }
}
