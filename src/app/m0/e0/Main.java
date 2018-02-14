package app.m0.e0;


public class Main {

    public static void main(String[] args) {
        final Tuple student1 = new Tuple(1, "Slava");
        final String name = (String) student1.getRight();

        System.out.println(name);
    }

}
