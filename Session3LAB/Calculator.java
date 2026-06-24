package anudip.Session3LAB;

public class Calculator {
    int sum;
    double ans;

    void add(int a, int b){
        sum = a + b;
        System.out.println(sum);
    }
    void add(int a, int b, int c){
        sum = a + b + c;
        System.out.println(sum);
    }

    void add(double a , double b){
        ans = a + b;
        System.out.println(ans);
    }
    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(20.0, 30.9);
    }
}
