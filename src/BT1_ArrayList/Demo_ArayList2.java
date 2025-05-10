package BT1_ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Demo_ArayList2 {
    public static void main(String[] args) {
        ArrayList<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Subscriptions");
        listMenu.add("Expenses");
        listMenu.add("Contracts");


        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }

        System.out.println("=======================");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(listMenu); // Them nguyen listMenu vao list2
        list2.add("Tasks");
        list2.add("Reports");

//        list2.removeAll(listMenu); // Xoa nhung thang chi dinh
        list2.retainAll(listMenu); // Xoa nguoc: xoa nhung thang khong chi dinh

        for (String a : list2) {
            System.out.println(a);

        }

        // Mo rong kieu du lieu Object (chua nhieu kieu du lieu khac)
        ArrayList<String> list3 = new ArrayList<>();// Kieu Object, chua ca kieu du lieu nguyen thuy va kieu oop
        list3.add("100");
        list3.add("10");

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
//            System.out.println(list3.get(i) == "Selenium");
            System.out.println(list3.get(i).equals("10"));
            System.out.println("++++++++++++++++++");
            System.out.println(Integer.parseInt(list3.get(i)));
        }
    }
}
