package tutorials.slidenerd.javaoop;

/**
 * Created by Microsoft on 10/7/2015.
 */
public class AbstractClassMethod {
    public static void main(String[] args) {
        Human human = new Human();
        human.printInfo();

        LivingBody livingBody = new LivingBody() {
            @Override
            void printInfo() {
                System.out.println("This livingbody is from JFrameExample");
            }
        };
        livingBody.printInfo();
    }
}

abstract class LivingBody {
    String sound;

    abstract void printInfo();
}

class Human extends LivingBody {
    String character = "Human Class";

    public void printInfo() {
        System.out.println(character);
    }
}
