package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class BaseClassException extends Exception {
    public BaseClassException() {
        System.out.println("Base Class Constructor");
    }
}

class DerivedClassException extends BaseClassException {
    public DerivedClassException() {
        System.out.println("Derived Class Constructor");
    }
}

public class ExceptionDerivedBaseClass {
    public static void main(String args[]) {
        try {
            throw new DerivedClassException();
        }
        // Must place Derived Class Exception First
        // Also Call Base Class Constructor
        catch (DerivedClassException b) {
            System.out.println("Derived Class Exception");
        } finally {
            System.out.println("I am in finally Block");
        }
    }
}