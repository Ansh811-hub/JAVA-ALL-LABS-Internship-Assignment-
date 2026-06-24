package anudip.COLLECTIONFRAMEWORKLAB.PRACTICALACTIVITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collections {
    void usage(ArrayList<String> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        Collections.sort(arr);
        System.out.println("sorted arraylist");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println();
        Collections.reverse(arr);
        System.out.println("reversed arraylist");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        String n = Collections.max(arr);
        System.out.println("maximum element ");
        System.out.println(n);

        System.out.println();
        String p =  Collections.min(arr);
        System.out.println("minimum element ");
        System.out.println(p);

        arr.add("JAVA");
        int o = Collections.frequency(arr,"JAVA");
        System.out.println("frequency of JAVA");
        System.out.println(o);

    }
    public void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the arraylist");
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(sc.next());
        }
        usage(arr);
    }
}
