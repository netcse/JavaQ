package generics;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Microsoft on 10/19/2015.
 */
public class ListMixedData {
    public static void main(String[] args) {
        List<Object> myList = new LinkedList<>();
        myList.add(new Integer(25));
        myList.add(new Double(99.99));
        myList.add(new String("abcdefghijklmnopqrstuvwxyz"));
        for (Object o : myList) {
            System.out.println(o);
        }
    }
}
