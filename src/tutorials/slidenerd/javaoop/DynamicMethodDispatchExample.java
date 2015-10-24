package tutorials.slidenerd.javaoop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Microsoft on 10/6/2015.
 */
public class DynamicMethodDispatchExample {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" 1. Mashable Reader\n 2. LifeHacker Reader\n");
        Scanner sc = new Scanner(System.in);
        BlogReader blogReader = null;
        switch (sc.nextInt()) {
            case 1:
                blogReader = new MashableReader();
                break;
            case 2:
                blogReader = new LifeHacker();
                break;
            default:
                System.out.println("Default Blog Reader");
                break;
        }
    }
}

class BlogReader {
    public BlogReader() {
        System.out.println("BlogReader Reader");
    }
}

class MashableReader extends BlogReader {
    public MashableReader() {
        System.out.println("Mashable Reader");
    }
}

class LifeHacker extends BlogReader {
    public LifeHacker() {
        System.out.println("LifeHacker Reader");
    }
}