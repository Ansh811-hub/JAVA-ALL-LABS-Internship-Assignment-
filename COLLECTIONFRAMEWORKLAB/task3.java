package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task3 {
    void sort(ArrayList<String> arr){
        Collections.sort(arr);
        for(int i = arr.size()-1;i>=0;i--){
            System.out.println(arr.get(i));
        }
    }
    public void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            arr.add(sc.nextLine());
        }
        task3 obj = new task3();
        obj.sort(arr);
    }
}
