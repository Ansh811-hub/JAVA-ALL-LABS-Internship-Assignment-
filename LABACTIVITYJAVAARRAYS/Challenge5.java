package anudip.LABACTIVITYJAVAARRAYS;

import java.util.Scanner;

public class Challenge5 {
    static void problem(int[][] arr, int[][] num, int n, int m, int p, int q) {

        if (n != p || m != q) {
            System.out.println("Matrix addition not possible");
            return;
        }

        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = arr[i][j] + num[i][j];
            }
        }
        System.out.println("addition matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Challenge5 obj = new Challenge5();
        System.out.println("enter no of elements in array 1 as row ");
        int n = sc.nextInt();
        System.out.println("enter no of elements in array 1 as column ");
        int m = sc.nextInt();
        System.out.println("enter elements of array 1");
        int[][] arr = new int[n][m];
        System.out.println("enter elements of array 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements of array 2 as row");
        int p = sc.nextInt();
        System.out.println("enter elements of array 2 as column");
        int q = sc.nextInt();
        int[][] num = new int[p][q];
        System.out.println("enter elements of array 2");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        obj.problem(arr, num, n, m, p, q);

    }
}
