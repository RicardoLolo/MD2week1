package Thuchanh.StaticMethod;

public class TestStaticMethod {
    public static void main(String args[]) {
        Thuchanh.StaticMethod.Student.change(); //calling change method

        //creating objects
        Thuchanh.StaticMethod.Student s1 = new Thuchanh.StaticMethod.Student(111, "Hào");
        Thuchanh.StaticMethod.Student s2 = new Thuchanh.StaticMethod.Student(222, "Đậu");
        Thuchanh.StaticMethod.Student s3 = new Thuchanh.StaticMethod.Student(333, "Quang");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
