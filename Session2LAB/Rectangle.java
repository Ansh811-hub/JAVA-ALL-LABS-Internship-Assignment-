package anudip.Session2LAB;

public class Rectangle {
    private double height;
    private double width;

    enum color{
        RED,
        GREEN,
        BLUE
    }

    // MEMBER VARIABLE OF TYPE COLOR
    color boxcolor;

    public static void main(String [] args){

        // pritn enum color.BLUE
        System.out.println(color.BLUE);
    }
}
