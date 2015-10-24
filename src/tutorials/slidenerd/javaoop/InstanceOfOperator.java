package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/6/2015.
 */
public class InstanceOfOperator {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog instanceof Animal); // true
        dog = null; // as dog refers to null
        System.out.printf("Now dog instance of Dog = %b", dog instanceof Dog); // false
        System.out.println();
        System.out.printf("Now dog instance of Animal = %b", dog instanceof Animal); // false
        System.out.println();
        Animal animal = new Animal();
        System.out.printf("Now animal instance of Dog = %b", animal instanceof Dog); // false
        System.out.println();

        Animal an = new Dog();
        // instanceof operator checking
        if (an instanceof Dog) {
            Dog dg = (Dog) an;
            System.out.println("Typecasting possible");
            System.out.println(dg); // java.lang.ClassCastException at runtime
        } else {
            System.out.println("Typecasting cann't possible"); // output
        }
    }
}
