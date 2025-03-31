package Bai2_Contructor;

import java.sql.SQLOutput;

public class NhanVien {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    //Hàm xây dựng không tham số/ mặc định
//    public NhanVien() {
//        name = "Phuong Ly";
//        age = 18;
//        address = "Thai Binh";
//    }
//
//    // Hàm xây dựng có tham số
//    public NhanVien(String name1, int age1, String address1) {
//        this.name = name1; // dùng từ khoá this để phân biệt thành phần trong class và bên ngoài (tham số hoặc class khác)
//        this.age = age1;
//        this.address = address1;
//    }
//
//    public NhanVien(String name1) {
//        this.name = name1;
//    }
//
//    public NhanVien(String name1, int age1, String address1, String website) {
//        this.name = name1;
//        this.age = age1;
//        this.address = address1;
//        Customer.WEBSITE= website;
//    }

    public void getInfor() {
        System.out.println(name + " - " + age + " - " + address);
    }

    public void getInfor(String name) {// Tính đa hình
        System.out.println(name + " - " + age + " - " + address);
    }

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setAge(22);
        nhanVien1.getInfor();

        NhanVien nhanVien2 = new NhanVien();
        nhanVien1.setAge(22);
        nhanVien1.getInfor();


//        NhanVien nhanVien2 = new NhanVien("Toai", 29, "HT");
//
//        nhanVien2.setAge(30);
//
//        NhanVien nhanVien3 = new NhanVien("PPV");
//        nhanVien3.getInfor();
//
//        NhanVien nhanVien4 = new NhanVien("Toai", 129, "HT","HTTPS:CRM.COM");
        nhanVien4.getInfor();
        System.out.println(Customer.WEBSITE);
    }
}
