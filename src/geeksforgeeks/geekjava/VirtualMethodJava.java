package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class BaseVirtual {

    // virtual by default
    public void show() {
        System.out.println("Base::show() called");
    }
}

class DerivedVirtual extends BaseVirtual {
    public void show() {
        System.out.println("Derived::show() called");
    }
}


public class VirtualMethodJava {
    public static void main(String[] args) {
        BaseVirtual baseVirtual = new DerivedVirtual();
        baseVirtual.show();
        BaseVirtual bv = new BaseVirtual();
        bv.show();
    }
}
