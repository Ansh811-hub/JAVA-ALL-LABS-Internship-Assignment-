package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Scanner;

public class sumandaverageofarrayelements {
    static int problem(int [] arr){
        int sum=0;
        for(int i = 0; i< arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i< n; i++){
            arr[i]=sc.nextInt();
        }
        int q = problem(arr);
        System.out.println("The average of the elements in the array is "+(q/arr.length));
        System.out.println("The Sum is " + q);
    }
}
