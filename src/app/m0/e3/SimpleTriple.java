package app.m0.e3;


public class SimpleTriple<T> extends Tuple3<T, T> {

    private final T middle;

    public SimpleTriple(final T left, final T middle, final T right) {
        super(left, right);
        this.middle = middle;
    }

    public T getMiddle() {
        return this.middle;
    }

    public static void main(String[] args) {
        SimpleTriple<Long> triple;
    }

}
