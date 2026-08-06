// Task 6: Count Students in CSE Department

package anudip.StreamAPI.PracticalLAB;
import java.util.HashMap;
import java.util.Map;

public class Task6{
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Rahul", 85);
        students.put("Priya", 91);
        students.put("Karan", 88);
        students.put("Anjali",95);
        students.put("Sneha", 81);
        students.put("Pooja", 93);


        long count = students.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 80)
                .count();

        System.out.println(count);
    }
}
