package generics;

/**
 * Created by Microsoft on 10/19/2015.
 */


public class Box<T> {
    private T t;

    public Box() {

    }

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
