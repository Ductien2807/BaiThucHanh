package Customer;
import person.person;
import java.util.Scanner;
public class VipCustomer extends person {
    public String LoaiKH;
    Scanner sc = new Scanner(System.in);

    public VipCustomer() {
        LoaiKH = "Khach hang VIP";
    }

    public void nhap() {
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = sc.nextInt();
    }

    public void xuatLoaiKH() {
        System.out.println("\n\n==== " + LoaiKH + " ====");
    }
}