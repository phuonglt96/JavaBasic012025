package Bai1_Array;

public class DemoArray {
    public static void main(String[] args) {

        //Khai báo mảng
        int[] mangSoNguyen;


        //Khoi tao mang
        mangSoNguyen = new int[10];

        //Khai bao va khoi tao
        int[] mangSoNguyen2 = new int[5];

        String[] listMenu = new String[10];

        //Gán giá trị vào trong mảng
        listMenu[0] = "Dashboard";
        listMenu[1] = "Customer";
        listMenu[7] = "Tasks";

        //Truy suất giá tri thủ công từng vị tr
        System.out.println(listMenu[0]);
        System.out.println(listMenu[1]);
        System.out.println(listMenu[7]);

        System.out.println("============");
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(listMenu[i]);
        }
        System.out.println("============");
        // Khai báo + khởi tạo + gán giá trịmảng nặc danh cho mảng a
        int a[] = {33, 3, 4, 5};

        // in mảng a ra màn hình
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
