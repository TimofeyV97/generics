package app.m0.e0;


public class Tuple {

    private final Object left;

    private final Object right;

    public Tuple(final Object left, final Object right) {
        this.left = left;
        this.right = right;
    }

    public Object getLeft() {
        return this.left;
    }

    public Object getRight() {
        return this.right;
    }

}
