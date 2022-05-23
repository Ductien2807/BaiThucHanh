import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class App114 {
    public static void main(String[] args) {
        int n;
        HashMap<String,String> hashMapSV = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String maSinhVien, hoTen;
        System.out.println("Nhap so sinh vien can nhap vao = ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap thong tin sinh vien thu "+i);
            System.out.println("Nhap ma sinh vien: ");
            maSinhVien = sc.nextLine();
            System.out.println("Nhap ho ten sinh vien: ");
            hoTen = sc.nextLine();
            hashMapSV.put(maSinhVien,hoTen);
        }
        Iterator<Map.Entry<String,String>> iterator = hashMapSV.entrySet().iterator();
        while(iterator.hasNext()){
            // tạo 1 entry
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+"\t\t"+entry.getValue());
        }
    }
    
}
 