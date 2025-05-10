package Bài1_toanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Số học
        System.out.println("a % b = " + (a%b));
//        System.out.println(a++);
//        System.out.println(++a);
        int c = a + ++b;
        int d = c;
        System.out.println(c);
        System.out.println(d);

        // Quan hệ - so sánh
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a > b);
        System.out.println(a < b );
        System.out.println(a == b);
        System.out.println(a != b);

        // Toán tử logic
        System.out.println("Logic &&: " + ((a < b) && (b > c)));
        System.out.println("Logic ||: " + ((a < b) || (b > c)));

        // Toá tử điều kiện
        int m = 20;
        int p = 3;
        String s = (m%p == 0) ? "m chia hết cho p" : "m không chia hết cho p";
        System.out.println(s);

        // Toán tử gán
        int var = 20;
        int v, q, r, x;
        v = q = r = x = var;
        System.out.println(x);

        int i = c = var;
        System.out.println(i);
        System.out.println(c);

        String actualHeader = ""; // dùng Selenium get cái header ra dạng text

        String expectedHeader = "Login";

        boolean check  = (actualHeader.equals(expectedHeader));
        boolean check2 = (actualHeader==expectedHeader);

        System.out.println(check + "" + check2);


    }
}
