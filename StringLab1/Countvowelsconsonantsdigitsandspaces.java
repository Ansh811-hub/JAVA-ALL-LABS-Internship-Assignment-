package anudip.StringLab1;
import java.util.*;
import java.util.Scanner;

public class Countvowelsconsonantsdigitsandspaces {
    public static void all(String s) {
        int count = 0;
        int countt = 0;
        int counttt = 0;
        int countttt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            } else if (ch == ' ') {
                countt++;
            } else if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9' || ch == '0') {
                counttt++;
            } else {
                countttt++;
            }
        }
        System.out.println("vowels,spaces,integers,Consonants");
        System.out.println(count);
        System.out.println(countt);
        System.out.println(counttt);
        System.out.println(countttt);
    }
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");
            String s = sc.nextLine();
            all(s);
        }
    }
