package anudip.StringLab1;

import java.util.Scanner;

public class palindrone {
    public static void palindrone(String str){
        String s = "";
        for(int i=str.length()-1;i>=0;i--){
           s += str.charAt(i);
        }
        if(str.equals(s)){
            System.out.println("Palindrone");
        }else{
            System.out.println("Not palindrone");
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();

        palindrone(str);

    }
}
