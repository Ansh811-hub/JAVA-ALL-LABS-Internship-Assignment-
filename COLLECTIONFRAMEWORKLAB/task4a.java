package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.HashSet;
import java.util.Scanner;

public class task4a {
    void hashset(HashSet<String> hashSet){
        for (String str:hashSet){
            System.out.println(str);
        }
    }
    public void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the HashSet");
        int n=sc.nextInt();
        HashSet<String> hashSet=new HashSet<>();
        for (int i=0;i<n;i++){
            hashSet.add(sc.nextLine());
        }
        task4a obj=new task4a();
        obj.hashset(hashSet);
    }
}