package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Microsoft on 10/21/2015.
 */


public class WildCardUnBounded {

    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer List
        List<Integer> intList = new ArrayList<>();
        // Or Arrays.asList(10,20,30);
        intList.add(10);
        intList.add(20);
        intList.add(30);
        System.out.println("Printing Integer list :");
        printList(intList);

        // String List
        List<String> stringList = new ArrayList<>();
        // Or Arrays.asList("10","20","30");
        stringList.add("10");
        stringList.add("20");
        stringList.add("30");
        System.out.println("Printing String list :");
        printList(stringList);
    }
}
