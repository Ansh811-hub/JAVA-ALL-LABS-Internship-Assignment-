import java.util.HashMap;
import java.util.Scanner;

public static class program3 {
    public void frequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String: ");
        String str = sc.nextLine();
        program3 obj = new program3();
        obj.frequency(str);

        sc.close();
    }


