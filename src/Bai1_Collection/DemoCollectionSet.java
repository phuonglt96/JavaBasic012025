package Bai1_Collection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {
    public static void main(String[] args) {
        Set <String> listSession = new HashSet<>();

        listSession.add("1");
        listSession.add("2");
        listSession.add("3");

        listSession.remove("3");
        listSession.remove("4");

        System.out.println(listSession.contains("2"));//true
        System.out.println(listSession.contains("7")); //false

        for (String session : listSession){
            System.out.println(session);
        }

    }
}
