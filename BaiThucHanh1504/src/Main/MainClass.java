package Main;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class MainClass {

 public static void main (String[]args) {
     // Thử nghiệm với lớp Hình tròn 
     HinhTron hinhTron = new HinhTron() ;
     hinhTron.xuatTen() ;
     hinhTron.nhapBanKinh();
     hinhTron.tinhChuvi () ;
     hinhTron.inChuVi();
     hinhTron.inDienTich();
     
     // Thử nghiệm với lớp hình trụ
     HinhTru hinhTru = new HinhTru();
     hinhTru.xuatTen();
     hinhTru.nhapChieuCao();
     hinhTru.tinhTheTich();
     hinhTru.inTheTich ();

     // Thử nghiệm với lớp hình chữ nhật
     HinhChuNhat hinhChuNhat = new HinhChuNhat();
     HinhChuNhat.xuatTen();
     HinhChuNhat.nhapChieuDai();
     HinhChuNhat.nhapChieuRong();
     HinhChuNhat.tinhChuvi();
     HinhChuNhat.tinhDienTich();
     HinhChuNhat.inChuVi();
     HinhChuNhat.inDienTich();

     // Thử nghiệm với lớp hình vuông
     HinhVuong hinhvuong = new HinhVuong();
     HinhVuong.xuatTen();
     HinhVuong.nhapCanh();
     HinhVuong.tinhChuvi();
     HinhVuong.tinhDienTich();
     HinhVuong.inChuVi();
     HinhVuong.inDienTich();
 }
    
}
