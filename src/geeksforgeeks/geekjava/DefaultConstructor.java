package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class Test {
    int i;
    Test t;
    boolean b;
    byte bt;
    float ft;
    double db;
    long mlong;
}

public class DefaultConstructor {
    public static void main(String args[]) {
        Test t = new Test(); // default constructor is called.
        System.out.println(t.i);
        System.out.println(t.t);
        System.out.println(t.b);
        System.out.println(t.bt);
        System.out.println(t.ft);
        System.out.println(t.db);
        System.out.println(t.mlong);
    }
}