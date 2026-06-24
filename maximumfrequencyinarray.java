package anudip;

import java.util.HashMap;
import java.util.Map;
public class maximumfrequencyinarray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40, 30, 20};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println("Element Frequencies:");
        for (Map.Entry<Integer, Integer> entry :
                frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " +
                    entry.getValue() + " times");
        }
    }
}