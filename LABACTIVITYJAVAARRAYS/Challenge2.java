package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Scanner;

public class Challenge2 {
    void problem(int [] arr){
        int count = 0;
        int countt = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                count++;
            }else{
                countt++;
            }
        }
        System.out.println("even are ");
        System.out.println(count);
        System.out.println("odd are");
        System.out.println(countt);
    }
    public static void main(String[] args) {
        Challenge2 obj = new Challenge2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        obj.problem(arr);
    }
}
