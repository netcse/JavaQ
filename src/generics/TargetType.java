package generics;

import java.util.Collections;
import java.util.List;

/**
 * Created by Microsoft on 10/21/2015.
 */


public class TargetType {

    static <T> List<T> emptyList() {
        return null;
    }

    static void processStringList(List<String> list) {

    }

    public static void main(String[] args) {
        processStringList(Collections.<String>emptyList()); // Needed Java SE 7
        processStringList(Collections.emptyList());     // From Java SE 8
    }
}
