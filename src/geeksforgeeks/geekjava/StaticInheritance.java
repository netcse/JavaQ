package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class ParentClass {
    public static void show() {
        System.out.println("Parent Class");
    }
}

class ChildClass extends ParentClass {
    public static void show() {
        System.out.println("Child Class");
    }
}


public class StaticInheritance {
    public static void main(String[] args) {
        ParentClass pc = new ChildClass();
        pc.show(); // hides child class as static // parent class

        // Like Button btn = (Button)findViewById(R.id.clickMe);
        ChildClass cc = (ChildClass) pc;
        cc.show();

        System.out.println("---------------------------------------");

        ChildClass childClass = new ChildClass();
        childClass.show();

        ParentClass parentClass = new ParentClass();
        parentClass.show();

    }
}
