package Shapes;

import java.ulti.Scanner;
public class HinhTron extends HinhHoc {
    public float bankinh;

    //Constructor
    public HinhTron() {
        ten = "Hình Tròn";
    }
    public void nhapBanKinh() {
        system.out.println("Bán kính = ");
        Scanner scanner = new Scanner(system.in);
        banKinh = scanner.nextFloat() ;
    }
    public void tinhChuvi() {
        chuvi=2 * PI * banKinh;
    }
    public void tinhDienTich() {
        dienTich = PI * bankinh *bankinh
    }
}
