package student;
import java.util.Scanner;
public class Onlinestudent extends Student {
    public String trangthai;

    public Onlinestudent() {
        LoaiSV = "Sinh vien hoc online";
    }

    public void nhapTrangThai() {
        System.out.println("Nhap trang thai: ");
        Scanner sc = new Scanner(System.in);
        trangthai = sc.nextLine();
    }

    public void inTrangThai() {
        System.out.println("Trang thai: " + trangthai);
    }
}