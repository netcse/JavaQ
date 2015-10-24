package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class ParentClassShadow {
    public static void print() {
        System.out.println("Parent Class Shadow");
    }
}

class ChildClassShadow extends ParentClassShadow {
    public static void print() {
        System.out.println("Child Class Shadow");
    }
}

public class ShadowingStaticFunctions {
    public static void main(String[] args) {
        ParentClassShadow parentClassShadow = new ChildClassShadow();
        parentClassShadow.print(); // Parent Class Shadow

        // If Both print() function are non-static
        // Then "Child Class Shadow" will be printed
    }
}
