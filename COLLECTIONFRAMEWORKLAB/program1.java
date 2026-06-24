// PART A : ARRAYLIST

package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class program1 {
void arraylist(ArrayList<String> list){
    System.out.println("Displaying all elements in the list: ");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    System.out.println("Removing an item : ");
    list.remove(list.size()-1);
    System.out.println("Displaying elements in the list: ");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
    System.out.println("Sorted list in ascending order: ");
    Collections.sort(list);
    System.out.println("Updated list : ");
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }
}
public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    System.out.println("enter how many stundets you want to add: ");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        list.add(sc.next());
    }
    arraylist(list);
}
}
