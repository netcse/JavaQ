package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class TestException extends Exception {
}

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch (TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally Block");
        }
    }
}
