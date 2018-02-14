package app.m1.e0;


public class Main {

    public static void main(String[] args) {
        final Box<Integer> myBox = new Box<>(1);
        final Integer i = myBox.getItem();
        System.out.println(i);
    }

}
