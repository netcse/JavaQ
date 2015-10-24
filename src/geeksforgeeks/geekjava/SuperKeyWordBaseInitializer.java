package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class BaseClassSuper {
    int b;

    public BaseClassSuper(int b) {
        System.out.println("Base Class Super Constructor is called");
        this.b = b;
    }
}

class ChildClassSuper extends BaseClassSuper {
    int c;

    public ChildClassSuper(int b, int c) {
        super(b);
        System.out.println("Child Class Constructor is called");
        this.c = c;
    }
}

public class SuperKeyWordBaseInitializer {
    public static void main(String[] args) {
        ChildClassSuper ccs = new ChildClassSuper(10, 20);
        System.out.println(ccs.b);
        System.out.println(ccs.c);
    }
}
