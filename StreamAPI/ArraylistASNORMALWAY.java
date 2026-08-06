package anudip.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class ArraylistASNORMALWAY {
     public class WithoutStream {
         public static void main(String[] args) {
             List<String> names = Arrays.asList("John","David","Emma","Alice");
             for(String name : names){
                 if(name.startsWith("A")){
                     System.out.println(name);
                 }
             }
         }
     }
}
