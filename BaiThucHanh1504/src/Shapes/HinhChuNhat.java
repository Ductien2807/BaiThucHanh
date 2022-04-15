package Shapes;

import java.ulti.Scanner;
public class HinhChuNhat  extends HinhHoc {
    
    public float dai;
    public float rong;

    //constructor
    public HinhChuNhat() {
        ten ="Hình Chữ Nhật" ;
    }
    public void nhapChieuDai() {
        system.out.println("Chiều dài = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void nhapChieuRong() {
        system.out.println("Chiều rộng =");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }
public void tinhChuvi() {
    chuVi = 2* (dai + rong );
}
public void tinhDienTich() {
    dienTich = dai * rong;
}   
}
