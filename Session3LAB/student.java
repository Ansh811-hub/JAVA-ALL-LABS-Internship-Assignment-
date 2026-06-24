import java.util.Scanner;

public class student {

    private String name;
    private int age;
    private String department;


    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String department() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
        System.out.println(name + age + department);
    }
}
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine(); // consume newline
        String department = sc.nextLine();
        student student = new student(name, age, department);
    }