package BT1_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> listMenu = new ArrayList<>();
        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Sales");
        listMenu.add("Contracts");
        listMenu.add("Subscriptions");
        listMenu.add("Expenses");
        listMenu.add("Contracts");
        listMenu.remove(2);
//        listMenu.remove("Expenses");
        listMenu.add(2, "Projects");
        System.out.println("Check value Contracts: " + listMenu.contains("Contracts"));
        System.out.println("Check value Contracts123: " + listMenu.contains("Contracts123"));
        System.out.println(listMenu.indexOf("Contracts")); // vi tri dau tien cua gia tri
        System.out.println(listMenu.lastIndexOf("Contracts")); // vi tri sau cung cua gia tri
        System.out.println("==============");
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }
        System.out.println("+++++++++++++++");
        Object[] mangMenu = listMenu.toArray();
        for (Object item : mangMenu) {
            System.out.println(item);
        }
        System.out.println("+++++++++++++++");
        List<Object> listConverted = new ArrayList<>();
        listConverted = Arrays.asList(mangMenu);
        for (Object item : listConverted) {
            System.out.println(item);
        }
    }
}
