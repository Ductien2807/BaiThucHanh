package Employee;
import person.person;

public class Employee extends person{
    protected final int NHAN_VIEN_SEP = 1;
    protected final int NHAN_VIEN_LINH = 2;
    protected final long LUONG_NHAN_VIEN_FULL_TIME_SEP = 20000000; 
    protected final long LUONG_NHAN_VIEN_FULL_TIME_LINH = 10000000; 
    protected final long LUONG_LAM_THEM_MOI_NGAY = 800000; 
    protected final long LUONG_NHAN_VIEN_PART_TIME_MOI_GIO = 100000; 

    protected long luong;

    public Employee(){
    }
    protected String loaiNhanVien(){
        return "";
    }

    protected void nhapttEmployee()
    {
        nhaptt();
    }

    protected void inttEmployee(){
        intt();
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}