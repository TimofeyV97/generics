package app.m0.e1;


public class Main {

    public static void main(String[] args) {
        final StringTuple st = new StringTuple("left", "right");
        final Tuple<String> st2 = new Tuple<>("l", "r");
        final Tuple<Integer> it = new Tuple<>(1, 2);
        final Tuple<SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());

        System.out.println(st2.getLeft());
        System.out.println(it.getLeft() + 15);
        System.out.println(tuple.getLeft());
    }

    private static class SuperClass {

        @Override
        public String toString() {
            return "super";
        }

    }

}
