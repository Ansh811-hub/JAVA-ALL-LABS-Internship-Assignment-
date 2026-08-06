// Task 4: Sort Students by Marks

package anudip.StreamAPI.PracticalLAB;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
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
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(System.out::println);
        }
}
