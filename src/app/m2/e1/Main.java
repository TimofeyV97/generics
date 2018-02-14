package app.m2.e1;


import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Collections.max(null);
        Enum<E> e;
    }

    enum E {
        A, B, C
    }

    public static class Man implements Cloneable<Man> {

        @Override
        public Man clone() {
            return new Man();
        }

    }

    public static interface Cloneable<T extends Cloneable<T>> {
        public T clone();
    }

    public static void cloneTwice(Cloneable<?> m) {
//        m.clone().clone();
        m.clone().clone().clone().clone().clone();
    }

}
