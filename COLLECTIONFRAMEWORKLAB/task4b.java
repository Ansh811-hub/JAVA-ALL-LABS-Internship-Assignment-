package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class task4b {
    void treeset(TreeSet<String> treeset){
        System.out.println(treeset);
    }
    public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        sc.nextLine();
        TreeSet<String> treeset =new TreeSet<>();
        System.out.println("Enter the elements in the TREESET");
        for (int i=0;i<n;i++){
            treeset.add(sc.nextLine());
        }
        task4b obj=new task4b();
        obj.treeset(treeset);
    }
}
