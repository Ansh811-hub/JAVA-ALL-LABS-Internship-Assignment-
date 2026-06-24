package anudip.COLLECTIONFRAMEWORKLAB;


import java.util.ArrayList;
import java.util.Scanner;

// Challenge Task
//1. Count the total number of students in the ArrayList

public class task1 {
    void count(ArrayList<Integer> list){
        int count = 0;
        for(int i=0;i<list.size();i++){
            count++;
        }
        System.out.println(count);
    }
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        count(list);
    }
}
