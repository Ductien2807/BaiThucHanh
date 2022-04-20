import model.NhanVienFullTime;
import model.NhanVienPartTime;
import util.Configs;
public class App79 {
    public static void main(String [] args){
        // Công ty có 3 nhân viên toàn thời gian, trong đó có 1 sếp, sếp không làm thêm ngày nào
        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); // Không làm thêm ngày nào
        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); // Làm thêm 3 ngày


        NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm


        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();

    }
}