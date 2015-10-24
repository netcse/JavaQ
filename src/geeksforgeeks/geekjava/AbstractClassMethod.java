package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

abstract class AbstractBaseClass {
    // An abstract Method
    abstract void abstractBaseMethod();

    // A Normal Method
    void fun() {
        System.out.println("Abstract Base Class");
    }
}

class AbstractChildClass extends AbstractBaseClass {

    public void abstractBaseMethod() {
        System.out.println("This is from abstract child class");
    }

    // A Normal Method
    public void fun() {
        System.out.println("Abstract Derived Class");
    }

}

public class AbstractClassMethod {
    public static void main(String[] args) {

        AbstractBaseClass abstractBaseClass = new AbstractChildClass();
        abstractBaseClass.fun(); // Abstract Derived Class

        AbstractChildClass abstractChildClass = (AbstractChildClass) abstractBaseClass;
        abstractChildClass.fun(); // Abstract Derived Class

        new AbstractBaseClass() {
            @Override
            void abstractBaseMethod() {
            }
        }.fun(); // Abstract Base Class

    }
}
