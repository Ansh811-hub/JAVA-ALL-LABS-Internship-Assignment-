// Task 2: Display Students Scoring Above 80

package anudip.StreamAPI.PracticalLAB;
import java.util.*;
import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();
        students.put("Rahul",85);
        students.put("Priya",91);
        students.put("Karan",88);
        students.put("Anjali",95);
        students.put("Sneha",81);
        students.put("Pooja",93);

        students.entrySet()
                .stream()
                .filter(entry -> entry.getValue()>80)
                .forEach(System.out::println);
    }
}
