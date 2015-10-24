package generics.container;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by Microsoft on 10/21/2015.
 */
public class VectorContainer {
    public static void main(String[] args) {
        Vector<Integer> vecInt = new Vector<>();
        vecInt.add(1000);
        vecInt.add(2000);
        System.out.println(vecInt.get(0));
        System.out.println(vecInt.elementAt(0));
        System.out.println(vecInt.capacity());
        System.out.println(vecInt.iterator().next());
        System.out.println(vecInt.toString());
        System.out.println(vecInt.contains(2000));
        System.out.println(vecInt.hashCode());
        System.out.println(vecInt.firstElement());
        System.out.println(vecInt.lastElement());
        List<Integer> intList = new ArrayList<>();
        intList = vecInt;
        System.out.println(intList.size());
        System.out.println(intList.get(0));
        System.out.println(intList.set(1, 3000));
        System.out.println(intList.toString());
    }
}
