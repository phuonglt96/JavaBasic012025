package Bai1_Method;

public class DemoPhuongThuc {
    //Hàm không trả về kết quả
    public static void login() {
        System.out.println("Set email: ");
        System.out.println("Set password: ");
        System.out.println("Click Login button");
    }

    // Hàm có trả về kết quả
    public static String getHeaderPage(){
        System.out.println("Dùng Selenium lấy cái Header page.");
        String header = "Customers Summary";

        return header;
    }

    // Hàm không trả về kết quả có tham số
    public static void login(String email, String password) {
        System.out.println("Set email: " + email);
        System.out.println("Set password: " + password);
        System.out.println("Click Login button");

    }

    //Phương thức sum trả về kiểu int, là tổng của hai tham số
    public static int sum(int a, int b) {
        //phương thức kết thúc khi gặp return
        return a + b;
    }

    public static int getCustomerTotal(){
        //Dùng Selenium để get Customer Total
        int customerTotal = 350;
        return customerTotal;

    }

    public static int getCustomerDeActive(){
        int customerDeActive = 150;
        return customerDeActive;

    }


    public static void main(String[] args) {
        login();
        login("phuong@gmail.com", "12345");
        String value2 = getHeaderPage();
        System.out.println(value2);

        int value = sum(1, 2);
        System.out.println(value);

        System.out.println(getCustomerTotal()+ getCustomerDeActive());
    }
}
