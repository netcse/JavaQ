package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/6/2015.
 */
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Checking ------------------
        //  Compile time        Runtime
        Animal an = new Dog();
        an.move(); // Dog Moves
    }
}

class Animal {
    public void move() {
        System.out.println("Animal Moves");
    }
}

class Dog extends Animal {
    // Method Overriding
    public void move() {
        // calling parent class move by
        // super.move();
        System.out.println("Dog Moves");
    }
}