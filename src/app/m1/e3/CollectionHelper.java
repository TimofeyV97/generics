package app.m1.e3;


import java.util.List;

public class CollectionHelper {

    public <T>int findIndex(final List<T> list, final T target) {
        for (int i = 0; i < list.size(); i++) {
            final T element = list.get(i);

            if (element.equals(target)) {
                return i;
            }
        }

        return -1;
    }

}
