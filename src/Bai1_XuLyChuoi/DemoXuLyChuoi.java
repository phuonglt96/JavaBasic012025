package Bai1_XuLyChuoi;

public class DemoXuLyChuoi {
    public static void main(String[] args) {
        String str1 = "Java for tester";
        String str2 = "Selenium";
        String str3 = "  TestNG  ";

        System.out.println("Cắt chuỗi: " + str1.substring(5));
        System.out.println("Cắt chuỗi: " + str1.substring(5, 8));

        System.out.println("Độ dài chuỗi:" + str1.length());
        System.out.println("Vị trí ký tự trong chuỗi:" + str1.indexOf("a"));
        System.out.println("Vị trí ký tự trong chuỗi:" + str1.indexOf("a", 2));

        String[] tachChuoi = str1.split(" ");
        for (String item : tachChuoi) {
            System.out.println(item);
        }

        System.out.println("Chữ in hoa: " + str2.toUpperCase());

        String temp = str1.replace(" ", "-");
        System.out.println(temp);

        System.out.println("Kiểm tra rỗng: " + str2.isEmpty());

        // Chuyển chuỗi thành mảng ký tự
        char[] mangChar = str2.toCharArray();
        for (char item : mangChar) {
            System.out.println(item);
        }

        System.out.println("================");
        System.out.println(str3);
        System.out.println(str3.trim());

        // Chuyển kiểu dữ liệu khác sang dạng chuỗi
        System.out.println(String.valueOf(12345) + 5);

        // Chuyển kiểu dữ liệu chuỗi sang dạng số
        System.out.println(Integer.parseInt(String.valueOf(12345)) + 5);
        System.out.println(Integer.parseInt("2345") + 5);

        System.out.println("================");
        // Tách số từ trong chuỗi
        String strTasks = "Tasks asigned to me: 78";
        System.out.println(strTasks.substring(strTasks.length() -2));

        int itemTotal = strTasks.split(" ").length;
        System.out.println(itemTotal);
        String [] listItems = strTasks.split(" ");
        System.out.println(listItems[itemTotal-1]);
    }
}
