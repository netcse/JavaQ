package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Microsoft on 10/21/2015.
 */


public class WildCardUpperBound {

    // This method is more powerful than next one
    // As this method works all Number and subtype
    // Double Integer Float etc
    public static void sumList(List<? extends Number> numList) {
        System.out.println(numList.toString());
    }

    // This method only works with Number type
    public static void sumNumber(List<Number> numList) {
        System.out.println(numList.toString());
    }

    // From SE Docs Same as Method sumList()
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        // Double
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(99.99);
        doubleList.add(199.99);
        sumList(doubleList);
        System.out.println("SE Docs Sum of Double: " + sumOfList(doubleList));

        // Integer
        List<Integer> intList = new ArrayList<>();
        intList.add(99);
        intList.add(199);
        sumList(intList);
        System.out.println("SE Docs Sum of Integer: " + sumOfList(intList));

        // Number
        List<Number> numList = new ArrayList<>();
        numList.add(99);
        numList.add(199);
        sumNumber(numList);
        System.out.println("SE Docs Sum of Number: " + sumOfList(numList));
    }

}
