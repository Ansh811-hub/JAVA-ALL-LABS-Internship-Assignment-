package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task3 {
    void shuffle(ArrayList<String> arr){
        Collections.shuffle(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }

    public void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the arraylist:");
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();
        System.out.println("Enter the elements of the arraylist:");
        for(int i=0;i<n;i++){
            arr.add(sc.nextLine());
        }
        shuffle(arr);
    }
}
