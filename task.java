package anudip;

import java.io.FileOutputStream;

public class task{
        public static void main(String[] args) {
            try {
                FileOutputStream fiso = new FileOutputStream("D://shivam.txt");
                fiso.write(65);
                fiso.close();
                System.out.println("Data written successfully");
            } catch (Exception e) {
                System.out.println("Exception handled");
            }
        }
    }

