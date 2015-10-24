package generics;

/**
 * Created by Microsoft on 10/20/2015.
 */

/**
 * Lesson From Generics & Subtypes:
 * Box<Integer> is not a subtype of Box<Number>
 * even though Integer is a subtype of Number.
 */

public class GenericsInheritanceSubtypes {
    public static void main(String[] args) {
        Object someObject = new Object();
        Integer integer = new Integer(10);
        someObject = integer;
        System.out.println(someObject);
    }
}
