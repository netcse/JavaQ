package generics;

/**
 * Created by Microsoft on 10/20/2015.
 */


/**
 * type interface feature
 */

class Util {
    public static <K, V> boolean compare(OrderedPair<K, V> op1, OrderedPair<K, V> op2) {
        return op1.getKey().equals(op2.getKey()) &&
                op1.getValue().equals(op2.getValue());
    }
}


public class GenericMethods {
    public static void main(String[] args) {
        OrderedPair<Integer, String> op1 = new OrderedPair<>(1, "Islam");
        OrderedPair<Integer, String> op2 = new OrderedPair<>(2, "Islam");
        System.out.println(Util.compare(op1, op2)); // false -> // type interface feature
    }

}
