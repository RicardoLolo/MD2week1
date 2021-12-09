package Baitap.ClassFan;

public class Main {
    public static void main(String[] args) {

        ClassFan fan1 = new ClassFan(3, true, 10, "yellow");
        ClassFan fan2 = new ClassFan(1, false, 5, "blue");
        ClassFan fan3 = new ClassFan();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}