package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        super.Print();
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        super.Print();
        System.out.println("Child's Print()");
    }
}

public class GrandParentClassConstructor {
    public static void main(String[] args) {
        Child c = new Child();
        c.Print();
    }
}