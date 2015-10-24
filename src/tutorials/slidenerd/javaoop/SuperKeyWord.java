package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/6/2015.
 */
public class SuperKeyWord {
    public static void main(String[] args) {
        B b = new B(10, 20);
        System.out.println(b.a);
        System.out.println(b.b);
    }
}

class A {
    int a = 1;

// Default constructor will always call to it's superclass default
// constructor

//    public A() {
//        System.out.println("A constructor");
//    }

    public A(int n1) {
        System.out.println("A's constructor is called");
        a = 2 * n1;
    }
}

class B extends A {
    int b = 2;

    public B() {
        super(0);
        System.out.println("B constructor");
    }

    public B(int n1, int n2) {
        super(n1);
        b = n2;
    }
}
