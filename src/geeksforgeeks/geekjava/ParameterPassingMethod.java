package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */
public class ParameterPassingMethod {

    public static void swap(Integer i, Integer j) {
        Integer tmp = new Integer(i);
        i = j;
        j = tmp;
    }

    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println(i + " " + j);
    }
}
