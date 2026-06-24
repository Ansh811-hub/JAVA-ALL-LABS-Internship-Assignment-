package anudip.ACTIVITYJAVAEXCEPTION;

import java.util.Scanner;

public class Task3 {
    static int problem(int[] arr){
        try{
            int p =arr[8];
            return p;
        }catch(Exception e) {
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("done");
        }
        return 0;
    }

    public static  void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int q;
        int [] arr = new  int[5];
        arr = new int[]{1, 2, 3, 4, 5, 6};
        q = problem(arr);
        System.out.println(q);
    }
}
