package app.m1.e3;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        CollectionHelper stringCollectionHelper = new CollectionHelper();
        int result = stringCollectionHelper.<String>findIndex(list, "sdfa");
    }

}
