// PART B: HASHSET

package anudip.COLLECTIONFRAMEWORKLAB;

import java.util.HashSet;
import java.util.Scanner;

public class program2 {
    public void hashset(HashSet<String> hash){
        System.out.println("Displaying hashset : ");
        System.out.println(hash);
    }
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> hash = new HashSet<>();
        System.out.println("Enter the number of elements in the HashSet");
        int n = sc.nextInt();
        System.out.println("enter the course names: ");
        for (int i = 0; i < n; i++) {
            hash.add(sc.next());
        }
        hashset(hash);
    }
}


// WHY THE DUPLICATES VALUE IS NOT STRORED

// BECAUSE HASHSET ONLY STORES THE INPUT ONCE AND DOESN'T ALLOW DUPLICATE..
// HASHSET'S PROPERTY -----> DOESN'T ALLOW DUPLICATES
