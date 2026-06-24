package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task4 {
    void descending(ArrayList<String> arr) {
        Collections.sort(arr, Collections.reverseOrder());
    for(int i=0;i<arr.size();i++){
        System.out.print(arr.get(i)+" ");
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the arraylist : ");
        int n=sc.nextInt();
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.next());
        }
        task4 obj=new task4();
        obj.descending(arr);
    }
}
