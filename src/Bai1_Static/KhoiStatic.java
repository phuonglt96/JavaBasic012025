package Bai1_Static;

public class KhoiStatic {
    //Khối static dùng để chạy trước hàm main hoặc trước nhất trong class này (nếu class khác gọi tới class này thì sẽ được chạy)
    //Tự động chạy, không gọi lại sử dụng được
    static {
        System.out.println("Setup môi trường");
    }

    public static void getInfo(){
        System.out.println("Name: Phuong Ly");
    }

    public static void main(String []args) {
        System.out.println("Login Test");
    }

    static {
        System.out.println("Khối static: hello 1!");
    }

    static {
        System.out.println("Khối static: hello 2!");
    }

    static {
        System.out.println("Khối static: hello 3!");
    }
}
