// Task 3: Display Only Student Names

package anudip.StreamAPI.PracticalLAB;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Rahul", 85);
        students.put("Priya", 91);
        students.put("Karan", 88);
        students.put("Anjali", 95);
        students.put("Sneha", 81);
        students.put("Pooja", 93);

        students.entrySet()
                .stream()
                .map(entry -> entry.getKey())
                .forEach(System.out::println);
    }
}