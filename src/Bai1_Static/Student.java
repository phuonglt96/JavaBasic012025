package Bai1_Static;

public class Student {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";


    Student(int r, String n) {
        rollno = r;
        name = n;
    }


    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }


    public static void main(String[] args) {
        Student s1 = new Student(111, "Thông");
        Student s2 = new Student(222, "Minh");


        s1.display();
        s2.display();
    }
}