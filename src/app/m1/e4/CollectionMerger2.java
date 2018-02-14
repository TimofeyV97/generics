package app.m1.e4;


import java.util.ArrayList;
import java.util.List;

public class CollectionMerger2 {

    public static <T, L extends T, R extends T>List<T> merge(final List<L> left, final List<R> right) {
        final List<T> result = new ArrayList<>();

        result.addAll(left);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {
        final List<Dog> dogs = new ArrayList<>();
        final List<Cat> cats = new ArrayList<>();
        final List<Animal> animals = CollectionMerger2.<Animal, Dog, Cat>merge(dogs, cats);
    }

}
