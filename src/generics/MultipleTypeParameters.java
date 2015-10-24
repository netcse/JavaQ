package generics;

/**
 * Created by Microsoft on 10/20/2015.
 */

/*
    Box Interface:
    ==============

    class Box<T> {
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
 */


interface Pair<K, V> {
    public K getKey();

    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}


public class MultipleTypeParameters {
    public static void main(String[] args) {
        OrderedPair<String, String> op = new OrderedPair<>("Islam", "Dawa");
        OrderedPair<String, Integer> opsi = new OrderedPair<>("Islam", 570);
        System.out.println(op.getKey() + " -> " + op.getValue()); // Islam -> Dawa
        System.out.println(opsi.getKey() + " -> " + opsi.getValue()); // Islam -> 570

        OrderedPair<String, Box<Integer>> opbox = new OrderedPair<>("Primes", new Box<Integer>());
        opbox.getValue().set(99);
        System.out.println(opbox.getKey() + " -> " + opbox.getValue().get()); // Primes -> 99

    }
}


