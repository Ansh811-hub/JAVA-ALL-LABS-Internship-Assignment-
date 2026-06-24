package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    void uppercase(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i).toUpperCase());
            System.out.println(i + " " + arr.get(i));
        }
    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }

        task2 obj = new task2();
        obj.uppercase(arr);
        sc.close();
    }
}
