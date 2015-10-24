package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class StaticBlock {
    static int i;
    int j;

    StaticBlock() {
        System.out.println("From StaticBlock Constructor");
    }

    static {
        System.out.println("Before accessing i variable");
        i = 10;
        System.out.println("Static Block is called");
    }
}


public class StaticBlockJava {
    public static void main(String[] args) {
        System.out.println(new StaticBlock().i);
        System.out.println("==============================");
        new StaticBlock();
    }
}
