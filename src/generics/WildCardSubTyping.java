package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Microsoft on 10/21/2015.
 */


public class WildCardSubTyping {
    public static void main(String[] args) {

        // Sub Typing
        List<? extends Integer> integerList = new ArrayList<>();
        List<? extends Number> numbersList = integerList;

        // Another Example
        List<? extends Number> numberList = new ArrayList<>();
        // casting required
        List<? extends Integer> intList = (List<? extends Integer>) numberList;

    }
}
