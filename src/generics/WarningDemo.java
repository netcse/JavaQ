package generics;

/**
 * Created by Microsoft on 10/20/2015.
 */

public class WarningDemo {
    public static void main(String[] args) {
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox() {
        return new Box();
    }
}