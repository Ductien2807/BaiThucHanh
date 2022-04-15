package Shapes;

import java.util.Scanner;
public class HinhTru extends  HinhTron  {
    public float chieuCao;
    //Constructor
    public HinhTru() {
        ten = "Hình Trụ";
    }
    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chiều cao =");
        Scanner scanner = new Scanner(System.in);
        chieucao = Scanner.nextFloat();
    }
    public void tinhTheTich() {
        tinhDienTich();
        theTich = dientich * chieucao ;
    }
    
}
