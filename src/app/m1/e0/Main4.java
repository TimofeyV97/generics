package app.m1.e0;


public class Main4 {

    public static void main(String[] args) {
        Box<Integer> b = new Box<>(1);
        Box b2 = b;
        b2.setItem("hello");
//        b.setItem("hello");
        System.out.println(b2.getItem());
        System.out.println(b.getItem());
        Integer i = b.getItem();
    }

}
