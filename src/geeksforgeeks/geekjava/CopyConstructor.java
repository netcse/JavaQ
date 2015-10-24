package geeksforgeeks.geekjava;

/**
 * Created by Microsoft on 10/24/2015.
 */

class ComplexNumber {
    double re, im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    ComplexNumber(ComplexNumber c) {
        System.out.println("Copy Constructor called");
        re = c.re;
        im = c.im;
    }

    @Override
    public String toString() {
        return String.format(re + " i" + im);
    }
}


public class CopyConstructor {
    public static void main(String[] args) {
        ComplexNumber cp1 = new ComplexNumber(10, 20);
        System.out.println(cp1); // 10.0 i20.0

        ComplexNumber cp2 = new ComplexNumber(cp1);
        System.out.println(cp2); // 10.0 i20.0

        ComplexNumber cn = cp2;
        System.out.println(cn); // 10.0 i20.0
    }
}
