package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class Complex {
    private double re, im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    /**
     * Returns the String representation of Complex Number
     *
     * @return String
     */

    @Override
    public String toString() {
        return String.format(re + " i" + im);
    }
}

public class OverridingtoStringMethod {
    public static void main(String[] args) {
        Complex com = new Complex(10, 20);
        System.out.println(com);
    }
}
