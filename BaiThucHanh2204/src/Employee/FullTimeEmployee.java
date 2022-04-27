package Employee;
import java.util.Scanner;
public class FullTimeEmployee extends Employee {
    public int luong;

    public FullTimeEmployee() {
        LoaiNV = "Nhan vien toan thoi gian";
    }

    public void nhapLuong() {
        System.out.println("Nhap luong: ");
        Scanner sc = new Scanner(System.in);
        luong = sc.nextInt();
    }

    public void inLuong() {
        System.out.println("Luong: " + luong);
    }
}