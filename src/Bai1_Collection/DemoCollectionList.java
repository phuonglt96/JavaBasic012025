package Bai1_Collection;

import java.util.ArrayList;
import java.util.List;

public class DemoCollectionList {
    public static void main(String[] args) {
        List<String> listMenu = new ArrayList<String>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Tasks");

        System.out.println(listMenu.size());

        listMenu.remove(1);
        listMenu.remove("Tasks");

        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println(listMenu.get(i));
        }
    }
}
