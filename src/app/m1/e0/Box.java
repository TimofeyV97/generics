package app.m1.e0;


public class Box<T> {

    private T item;

    public Box(final T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }

    public void setItem(final T item) {
        this.item = item;
    }

}
