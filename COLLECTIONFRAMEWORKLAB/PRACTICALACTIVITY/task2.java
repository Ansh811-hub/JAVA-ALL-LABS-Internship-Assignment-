package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    void equality(int [] arr,int [] arr2){
        boolean r = Arrays.equals(arr,arr2);
        System.out.println(r);
    }

    public void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter size of array 2 : ");
        int n2=sc.nextInt();
        int [] arr2=new int[n2];
        System.out.println("Enter the elements of the array 2 : ");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        equality(arr,arr2);
    }
}
