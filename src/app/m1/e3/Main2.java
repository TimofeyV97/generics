package app.m1.e3;


import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        int result = CollectionHelper2.<String>findIndex(list, "1");

        System.out.println(result);
    }

}
