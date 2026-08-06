// Task 5: Sort Students by Name

package anudip.StreamAPI.PracticalLAB;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
            HashMap<String, Integer> students = new HashMap<>();
            students.put("Rahul", 85);
            students.put("Priya", 91);
            students.put("Karan", 88);
            students.put("Anjali",95);
            students.put("Sneha", 81);
            students.put("Pooja", 93);

            students.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);
        }
    }

