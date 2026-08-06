// Task 1: Display All Students

package anudip.StreamAPI.PracticalLAB;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> Students = Arrays.asList("Rahul","Aman","Priya","Neha","Karan","Anjali","Rohit","Sneha","Vikas","Pooja");
        Students.stream()
                .forEach(System.out::println);
    }
}
