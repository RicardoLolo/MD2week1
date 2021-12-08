import java.util.Scanner;

public class chuyendoitiente {
    public static void main(String[] args) {
        double vnđ = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập số tiền USD:");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VNĐ:" + quydoi);
    }
}
