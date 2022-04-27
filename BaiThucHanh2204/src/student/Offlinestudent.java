package student;

public class Offlinestudent extends Student{
    protected String PhuongTienDiLai;

    public Offlinestudent (){
        HinhThucHoc = "Offline";
    }
    
    public void nhapttOff()
    {
        nhapttstudent();
        System.out.print("Phương tiện đi lại: ");
        PhuongTienDiLai = sc.nextLine();
    }
    public void inttOff()
    {
        inttStudent();
        System.out.println("Phương tiện đi lại: " + PhuongTienDiLai);
        System.out.println("Hình thức học: " + HinhThucHoc);
    }
}