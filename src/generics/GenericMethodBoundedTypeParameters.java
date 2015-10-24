package generics;

/**
 * Created by Microsoft on 10/20/2015.
 */

interface Comparable<T> {
    public int compareTo(T o);
}

public class GenericMethodBoundedTypeParameters {

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // countGreaterThan(intArray,10); // Not works but why??

        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
