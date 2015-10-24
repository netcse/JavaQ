package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/7/2015.
 */
public class AbstractMethodImplementation {
    public static void main(String[] args) {
        AbstractText abstractText = new AbstractText();
        abstractText.printSubInfo(); // SubClass info
        abstractText.printSuperInfo(); // SubClass info
    }
}

abstract class SuperClass {
    String info = "SuperClass info";

    abstract void printSuperInfo();
}

abstract class SubClass extends SuperClass {
    String info = "SubClass info";

    abstract void printSubInfo();
}

class AbstractText extends SubClass {

    @Override
    void printSubInfo() {
        System.out.println(super.info); // SubClass info
    }

    @Override
    void printSuperInfo() {
        System.out.println(super.info); // SubClass info
    }
}
