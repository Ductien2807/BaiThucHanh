public class App1603 {
    public static void main(String[] args ) throws Exception{
        
        Preson a = new Preson();
        SinhVien b = new SinhVien();
        PhuongTrinhBac2 c = new PhuongTrinhBac2();
        // Preson
        a.nhapPresonID();
        a.nhapPresonName();
        a.nhapGender();
        a.nhapAddress();
        System.out.print("\n\n");
        a.intt();

        System.out.print("\n\n");
        // sinhvien
        b.nhapMaSinhVien();
        b.nhapHoTen();
        b.nhapNgaySinh();
        b.nhapGioiTinh();
        b.nhapDiaChi();
        System.out.println("\n");
        b.intt();
        
        //ptb2
        c.nhapgiatri();
        c.inkq(c.giaiptb2());
    }
}