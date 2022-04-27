import Employee.FullTimeEmployee;
import Employee.PartTimeEmployee;
import student.Offlinestudent;
import student.Onlinestudent;
import Customer.Customer;
import Customer.VipCustomer;

public class Appperson {
    public static void main(String[] args) throws Exception {

        Offlinestudent off1 = new Offlinestudent();
        off1.nhapttOff();
        System.out.println("\nIn thông tin.\n");
        off1.inttOff();

        Onlinestudent onl1 = new Onlinestudent();
        onl1.nhapttOn();
        System.out.println("\nIn thông tin.\n");
        onl1.inttOn();

        PartTimeEmployee pt1 = new PartTimeEmployee();
        pt1.nhapttPartTime();
        System.out.println("\nIn thông tin.\n");
        pt1.tinhLuong();
        pt1.inttPartTimne();

        FullTimeEmployee ft1 = new FullTimeEmployee();
        ft1.nhapttFullTime();
        System.out.println("\nIn thông tin.\n");
        ft1.tinhLuong();
        ft1.inttFullTime();

        Customer c1 = new Customer();
        c1.nhapttCustomer();
        System.out.println("\nIn thông tin.\n");
        c1.inttCustomer();

        VipCustomer V1 = new VipCustomer();
        V1.nhapttVipCustomer();
        System.out.println("\nIn thông tin.\n");
        V1.inttVipCustomer();
    }
}