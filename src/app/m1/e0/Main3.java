package app.m1.e0;


import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        show(list);
    }

    public static void show(final List list) {
        list.forEach(System.out::println);
    }

}
