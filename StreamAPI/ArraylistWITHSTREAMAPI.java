package anudip.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArraylistWITHSTREAMAPI {
        public static void main(String[] args) {
            List<String> names = Arrays.asList("John","David","Emma","Alice");
            names.stream()
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        }
}

