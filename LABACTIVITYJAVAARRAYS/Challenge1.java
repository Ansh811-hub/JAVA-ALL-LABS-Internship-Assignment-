package anudip.LABACTIVITYJAVAARRAYS;


import java.util.Arrays;

// Challenge 1: Reverse an Array
public class Challenge1 {
    void problem(int[] arr){
        Arrays.sort(arr);
        for(int j=arr.length-1; j>=0; j--){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Challenge1 obj=new Challenge1();
        int[] arr={1,2,3,4,5};
        obj.problem(arr);
    }
}
